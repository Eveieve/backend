package day32_0227;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection2 {
    public static void main(String[] args) {
        Connection connection = null;

        // connection 시도
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul", "madang", "madang");
            System.out.println("Driver loaded");
        }catch (ClassNotFoundException e ) {
            jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul
            throw new RuntimeException(e);
        }catch (SQLException e){
            System.out.println("SQLException");
        } finally {
            // 연결 성공여부와 관계없이 요청 후에는 닫아줘야 한다.
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
