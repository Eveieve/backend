package day32_0227.class02.boards;

import java.io.FileNotFoundException;
import java.sql.*;

public class BoardSelectOne {
    public static void main (String[] args) throws FileNotFoundException, ClassNotFoundException {

        Connection connection = null;
        try {
            // 1. JDBC 드라이버 등록: mysql db 접근 위한 드라이버 등록.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // forName 은 꼭 예외처리하기.
            System.out.println("Driver loaded." + connection);

            // 2. mysql db에 연결객체 얻어와서 연결하기.
            // connection string 작성.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul", "madang", "madang"); // url은 벤더에서 만ㄷ름.


            // 3. 매개변수화된 SQL문 작성. DELETE statement
            String query = new StringBuilder()
                    .append(" select * from boards  ").toString();

            System.out.println(query);

            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = pstmt.executeQuery(); //?
            System.out.println(rs);
//
            if(rs.next()) {
                Board board = new Board();
                board.setBtitle(rs.getString("btitle"));
                System.out.println(board);
            }
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
