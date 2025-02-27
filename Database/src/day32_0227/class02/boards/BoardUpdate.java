package day32_0227.class02.boards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardUpdate {
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


            // update 실행시킬 sql 문
            String query = new StringBuilder()
                    .append(" UPDATE boards SET ") // UPDATE users SET btitle = ?, bcontent = ?
                    .append("btitle = ?,")
                    .append("bcontent = ?").toString(); // toString() 은 왜?

            System.out.println(query);
            // 3. 매개변수화된 SQL문 작성
            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            // 업데이트 할 값
            pstmt.setString(1, "Updated title"); //
            pstmt.setString(2, "I just updated the content"); // parameterIndex = column 순서?

            //pstmt.setBlob(5, new FileInputStream("src/day32_0227/class02/images/spring.jpg")); // FileInputStream 이 하는일?

            //4. SQL 문 실행
            pstmt.executeUpdate(); // 쿼리문을 담아서 DBMS 로 요청하기.

            // 잘 실행됐는지 확인
            int rows = pstmt.executeUpdate(); // rows 는 업데이트 된 행들?
            System.out.println(rows + " Updated.");

            // bno 값 얻어오기
            if(rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()) {
                    int bno = rs.getInt(1); // 첫번째값 가져오기
                }
                rs.close();
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

