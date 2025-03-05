package day35_0305.Practice03Answer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStmt04 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmt04() throws SQLException {

        conn =  DBUtil.getConnection();
        conn.setAutoCommit(false);

        //  CallableStatement 객체를 사용하여 저장 프로시저(Stored Procedure) 를 호출하는 코드
//        "{call SP_MEMBER_LIST()}" 는 저장 프로시저 호출 문법입니다.
//        {call 프로시저명(?, ?, ...)} 형식으로 사용됩니다.
//        괄호 안에 ? 를 사용하면 IN 또는 OUT 파라미터에 값을 전달하거나 받을 수 있습니다.
//                여기서는 파라미터가 없기 때문에 빈 괄호 () 를 사용했습니다.
        cs = conn.prepareCall("{call SP_MEMBER_LIST()}");

//        저장 프로시저가 SELECT 문을 수행하면 데이터가 결과 집합 형태로 반환됩니다.
//        이때 반환된 결과는 ResultSet 객체에 저장됩니다.
//        ResultSet 객체는 조회된 데이터에 접근하기 위한 인터페이스입니다.
//                rs.next() 를 사용하면 한 행씩 데이터를 읽어옵니다.
        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            sp_memberDto spMemberDto = new sp_memberDto(); // 클래스의 새로운 객체 생성.
            spMemberDto.setM_seq(rs.getInt("m_seq"));
            spMemberDto.setM_userid(rs.getString("m_userid"));
            spMemberDto.setM_pwd(rs.getString("m_pwd"));
            spMemberDto.setM_email(rs.getString("m_email"));
            spMemberDto.setM_hp(rs.getString("m_hp"));
            spMemberDto.setM_registdate(rs.getDate("m_registdate"));
            spMemberDto.setM_point(rs.getInt("m_point"));
            System.out.println(spMemberDto);
        }

        if(rs!=null) rs.close();
        if(cs != null) cs.close();
        if(conn != null) conn.close();

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmt04();

    }
}