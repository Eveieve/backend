package day32_0227;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdate {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // 1. JDBC 드라이버 등록: mysql db 접근 위한 드라이버 등록.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // forName 은 꼭 예외처리하기.
            System.out.println("Driver loaded." + connection);

            // 2. mysql db에 연결객체 얻어와서 연결하기.
            // connection string 작성.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul", "madang", "madang"); // url은 벤더에서 만ㄷ름.


            String query = new StringBuilder()
                    .append(" UPDATE users SET ")
                    .append(" userpassword = ?")
                    .append(" where userid = ?").toString();

            System.out.println(query);
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "12345678910");
            pstmt.setString(2, "mycaptain622");

            //4. SQL문 실행
            int rows =  pstmt.executeUpdate();
            System.out.println(rows + " rows update completed");
            //5. PreparedStatement 객체 닫기
            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}