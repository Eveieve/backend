package Revise;

import java.sql.*;

public class FetchAllPosts {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. MySQL JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver Loaded.");

            // 2. 데이터베이스 연결
            String url = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=Asia/Seoul";
            String user = "root";
            String password = "password";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected.");

            // 3. SQL 쿼리 작성 및 실행
            String sql = "SELECT post_id, title, content, author, created_at FROM posts";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                // 4. 조회된 데이터 출력
                while (rs.next()) {
                    int postId = rs.getInt("post_id");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    String author = rs.getString("author");
                    Date createdAt = rs.getDate("created_at");

                    System.out.println("Post ID: " + postId);
                    System.out.println("Title: " + title);
                    System.out.println("Content: " + content);
                    System.out.println("Author: " + author);
                    System.out.println("Created At: " + createdAt);
                    System.out.println("------------------------------");
                }

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            // 자원 해제
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
                System.out.println("Database Connection Closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
