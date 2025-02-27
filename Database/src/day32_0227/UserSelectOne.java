package day32_0227;
import java.sql.*;

public class UserSelectOne {
    public static void main(String[] args) {
        Connection connection = null;
        ResultSet rs  = null;
        try {
            // 1. JDBC 드라이버 등록: mysql db 접근 위한 드라이버 등록.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // forName 은 꼭 예외처리하기.
            System.out.println("Driver loaded." + connection);

            // 2. mysql db에 연결객체 얻어와서 연결하기.
            // connection string 작성.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul", "madang", "madang"); // url은 벤더에서 만ㄷ름.

            //3. 매개변수화된 SQL 문 작성
            String query = new StringBuilder()
                    .append(" SELECT * FROM users ") // 이게 왜 한개
                    .toString();


            PreparedStatement pstmt = connection.prepareStatement(query);
            //pstmt.setString(1, "ssgcom1");


            //4. SQL문 실행
            rs =  pstmt.executeQuery();


                         if(rs.next()) { // 첫번째 한 행만 불러옴.
                 User user = new User();
                 user.setUserid(rs.getString("userid"));
                 user.setUsername(rs.getString("username"));
                 user.setUserpassword(rs.getString("userpassword"));
                 user.setUserage(rs.getInt("userage"));
                 user.setUseremail(rs.getString("useremail"));
                 System.out.println(user);

             } else {
                 System.out.println("가입된 회원이 아닙니다.");
             }
//
//            while (rs.next()) {
//                User user = new User();
//                user.setUserid(rs.getString("userid"));
//                user.setUsername(rs.getString("username"));
//                user.setUserpassword(rs.getString("userpassword"));
//                user.setUserage(rs.getInt("userage"));
//                user.setUseremail(rs.getString("useremail"));
//                System.out.println(user);
//            }


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