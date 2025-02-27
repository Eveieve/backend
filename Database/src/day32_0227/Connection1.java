package day32_0227;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection1 {
    public static void main(String[] args) throws ClassNotFoundException{
        Connection connection = null;

        try {
            // 1. JDBC 드라이버 등록: mysql db 접근 위한 드라이버 등록.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // forName 은 꼭 예외처리하기.
            System.out.println("Driver loaded." + connection);

            // 2. mysql db에 연결객체 얻어와서 연결하기.
            // connection string 작성.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul", "madang", "madang"); // url은 벤더에서 만ㄷ름.

            // 3. 매개변수화된 SQL문 작성

            String query = "" + "insert into users (userid, username, userpass, userage, useremail) " + "values(?,?,?,?,?);";

            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1,"thesubstance");
            pstmt.setString(2, "substancename");
            pstmt.setString(3, "password");
            pstmt.setInt(4, 20);
            pstmt.setString(5, "substance@gmail.com");

            //4. SQL 문 실행
            pstmt.executeUpdate(); // 쿼리문을 담아서 DBMS 로 요청하기.

            // 잘 실행됐는지 확인
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows inserted.");
            pstmt.close(); // 실행된 후 닫아줘야함.

        } catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed"); // 닫아줘야함.
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
