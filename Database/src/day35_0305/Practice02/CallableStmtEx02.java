package day35_0305.Practice02;

import day35_0305.Practice02Answer.DBUtil;

import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Connection;

public class CallableStmtEx02 {
    public static void main(String[] args) throws SQLException {

        new CallableStmtEx02();
    }

    public CallableStmtEx02() throws SQLException {
        Connection conn = null;
        CallableStatement cs = null;

        conn = DBUtil.getConnection();

        cs = conn.prepareCall("{call SP_MEMBER_INSERT_PROCEDURE(?, ?, ?, ?, ?)}");

        cs.setString(1, "ss501");
        cs.setString(2, "sspassword");
        cs.setString(3, "hello@gmail.com");
        cs.setString(4, "01023456789");
        cs.registerOutParameter(5, java.sql.Types.VARCHAR);

        boolean flag = cs.execute();
        System.out.println(flag);

        if (cs != null) cs.close();
        if (conn != null) conn.close(); // 연결됐던 걸 끊어주기.

    }

}
