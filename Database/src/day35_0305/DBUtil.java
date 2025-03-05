package day35_0305;

// callable statement 사용하기 위한 7가지 스텝.
// 커넥션을 연결해주는 역할하는 클래스를 하나 만들어보기.

import java.sql.Connection;
import java.sql.SQLException;

// 싱글톤 적용한 connection 객체 제공하기.
public class DBUtil {
    // 객체를 나만 쓸 수 있게, 하지만 코드들이 공유할 수 있게 스태틱으로 설정한다.

    private static Connection conn = null;

    // 외부에서 인스턴스 생성 막기 위해서 프라이빗 생성자.
    private DBUtil() {
    }

    public static Connection getConnection() {
        if (conn != null) { // connection 연결이 되었다면
            return conn; // 연결을 리턴해주기.
            // 기존 연결한다면 존재한다면 그대로 반환하여 재사용한다.
        }

        // class 이름으로 드라이버 찾기.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. mysql 데베 연결하기.
            String url = "jdbc:mysql://192.168.50.2:3306/ssg?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "root";

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return conn;
    }
}
