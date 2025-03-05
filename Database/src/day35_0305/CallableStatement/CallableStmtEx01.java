package day35_0305.CallableStatement;

import javax.imageio.stream.ImageInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx01 {
    public static void main(String[] args) throws SQLException {
        new CallableStmtEx01();
    }

    public CallableStmtEx01() throws SQLException { // why SQL Exception..
        Connection conn = null;
        CallableStatement cs = null;

        // 1. connection 얻어오기.
        conn = DBUtil.getConnection();
        // 2. CallableStatement 객체 이용하여 프로시저를 호출한다. prepareCall 아규먼트에 sql 문법으로
        cs = conn.prepareCall("{call P_INSERTCODES(?, ?, ? )}"); // ? : cData, ? :cTname 이 매칭됨.
        // 3. 바인드 변수에 값을 셋팅 inparameter 에 값 넣기.
        cs.setString(1, "IT 기획자 ");
        cs.setString(2, "CODE1");


        // out 파라미터가 추가되면 - 파라미터에 저장된 프로시저의 수행 결과를 가져오기.
        cs.registerOutParameter(3, java.sql.Types.VARCHAR);
        // 4. 쿼리 수행.
        boolean flag = cs.execute();
        System.out.println(flag);

        if (cs != null) cs.close();
        if (conn != null) conn.close(); // 연결됐던 걸 끊어주기.
    }

}
