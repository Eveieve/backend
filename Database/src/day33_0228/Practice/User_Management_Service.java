package day33_0228.Practice;

import java.sql.*;
import java.util.Scanner;

public class User_Management_Service {


    private Scanner scan = new Scanner(System.in);


    public static void main(String[] args)  {


        try {
            new User_Management_Service().memberStart();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void memberStart() throws SQLException {
        while (true) {
            int choice = displayMenu();
            switch (choice) {
                case 1:    // 추가
                    insertMember();
                    break;
                case 2:    // 삭제
                    deleteMember();
                    break;
                case 3:    // 수정  ==> 전체 항목 수정
                    updateMember();
                    break;
                case 4:    // 전체 자료 출력
                    displayMember();
                    break;
                case 5:    // 수정	==> 원하는 항목만 수정
                    updateMember2();
                    break;
                case 0:    // 종료
                    System.out.println("작업을 마칩니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력했습니다. 다시입력하세요.");
            }
        }
    }

    private void displayMember() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        System.out.println();
        System.out.println("===============================================");
        System.out.println(" 회원ID   회원이름  비밀번호   전화번호    주 소");
        System.out.println("===============================================");

        try {
            conn = DBUtil.getConnection();

            // 테이블 데이터 출력
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from members"); // 모든 컬럼 출력

            // 데이터 출력

            int columnCount = rs.getMetaData().getColumnCount(); // 테이블 컬럼이 몇개인지 출력
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
            rs.close();
            System.out.println("===============================================");
            System.out.println("출력 작업 끝...");


        } finally {
            if(rs!=null) try{ rs.close();   }catch(SQLException e){}
            if(stmt!=null) try{ stmt.close();   }catch(SQLException e){}
            if(conn!=null) try{ conn.close();   }catch(SQLException e){}
        }

    }
    // 회원 정보를 추가하는 메서드
    private void insertMember() {
        Connection conn = null;
        PreparedStatement pstmt = null;


        conn = DBUtil.getConnection();

        System.out.println();
        System.out.println("추가할 회원 정보를 입력하세요.");

        int count = 0;
        String memId = null;  // 회원ID가 저장될 변수
        do {
            System.out.print("회원ID >> "); // auto increment primary key?
            memId = scan.next();
            count = getMemberCount(memId);
            if (count > 0) {
                System.out.println(memId + "은(는) 이미 등록된 회원ID입니다.");
                System.out.println("다른 회원ID를 입력하세요.");
            }

        } while (count > 0);

        System.out.print("회원이름 >> ");
        String memName = scan.next();

        System.out.print("비밀번호 >> ");
        String memPass = scan.next();

        System.out.print("전화번호 >> ");
        String memTel = scan.next();

        scan.nextLine();  // 입력 버퍼 비우기
        System.out.print("회원주소 >> ");
        String memAddr = scan.nextLine();
        String sql = "" + "insert into members (memName, memPass, memTel, memAddr) " + "values(?,?,?,?);";

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, memName);
            pstmt.setString(2, memPass);
            pstmt.setString(3, memTel);
            pstmt.setString(4, memAddr);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("회원 정보 추가 성공!!!");
            } else {
                System.out.println("회원 정보 추가 실패~~~");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    // 회원 정보를 삭제하는 메서드
    private void deleteMember() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        System.out.println();
        System.out.println("삭제할 회원 정보를 입력하세요.");
        System.out.print("삭제할 회원ID >> ");
        String memId = scan.next(); // id 컬럼은 없잖아?

        try {
            conn = DBUtil.getConnection();


            String query = new StringBuilder()
                    .append(" DELETE FROM members ")
                    .append(" where memId = ?").toString();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "ssg501");


            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("회원ID가 " + memId + "인 회원 삭제 성공!!");
            } else {
                System.out.println(memId + "은(는) 없는 회원ID이거나 "
                        + "삭제에 실패했습니다.");
            }

            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) try {
                pstmt.close();
            } catch (SQLException e) {
            }
            if (conn != null) try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }

    private void updateMember(){
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = DBUtil.getConnection();

        System.out.println();
        System.out.println("수정할 회원 정보를 입력하세요.");
        System.out.print("수정할 회원ID >> ");
        String memId = scan.next();

        int count = getMemberCount(memId);
        if(count==0){ // 없는 회원이면...
            System.out.println(memId + "은(는) 없는 회원ID입니다.");
            System.out.println("수정 작업을 중단합니다.");
            return;
        }

        System.out.println();
        System.out.println("수정할 내용을 입력하세요.");
        System.out.print("새로운 회원이름 >> ");
        String newMemName = scan.next();

        System.out.print("새로운 비밀번호 >> ");
        String newMemPass = scan.next();

        System.out.print("새로운 전화번호 >> ");
        String newMemTel = scan.next();

        scan.nextLine();
        System.out.print("새로운 회원주소 >> ");
        String newMemAddr = scan.nextLine();

        try {

            String query = new StringBuilder()
                    .append(" UPDATE members SET ")
                    .append(" memName = ?")
                    .append(" memPass = ?")
                    .append(" memTel = ?")
                    .append(" memAddr = ?")
                    .append(" where" +  " memId =" + memId).toString();


            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, newMemName);
            pstmt.setString(2, newMemPass);
            pstmt.setString(3, newMemTel);
            pstmt.setString(4, newMemAddr);
            //pstmt.setInt(5, Integer.parseInt(memId));


            //4. SQL문 실행
            int rows =  pstmt.executeUpdate();
            System.out.println(rows + " rows update completed");
            //5. PreparedStatement 객체 닫기
            pstmt.close();

            if(rows>0){
                System.out.println(memId + "회원 정보 수정 완료!!!");
            }else{
                System.out.println(memId + "회원 정보 수정 실패~~~");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            if(pstmt!=null) try{ pstmt.close();   }catch(SQLException e){}
            if(conn!=null) try{ conn.close();   }catch(SQLException e){}
        }

    }

// 회원ID를 인수값으로 받아서 해당 회원ID의 개수를 반환하는 메서드
private int getMemberCount(String memId){
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    conn = DBUtil.getConnection();

    int count = 0;
    try {

        conn = DBUtil.getConnection();

        // 데이터 출력

        String query = "SELECT COUNT(" + "memId" + ") FROM members";
        pstmt = conn.prepareStatement(query);
        rs = pstmt.executeQuery();

        if (rs.next()) { // select 로 반환된 객체를 읽기 위한 rs
            int memIdcount = rs.getRow();
            System.out.println(" memId 컬럼에 저장된 행 개수: " + memIdcount);
            return memIdcount; // 행개수 반환
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    } finally {
        if(rs!=null) try{ rs.close();   }catch(SQLException e){}
        if(pstmt!=null) try{ pstmt.close();   }catch(SQLException e){}
        if(conn!=null) try{ conn.close();   }catch(SQLException e){}
    }

    return count;

}
    // 원하는 회원정보 필드만 수정하기
    private void updateMember2() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        System.out.println();
        System.out.println("수정할 회원 정보를 입력하세요.");
        System.out.print("수정할 회원ID >> ");
        String memId = scan.next(); // 수정할 회원아이디.

        int count = getMemberCount(memId);
        if (count == 0) { // 없는 회원이면...
            System.out.println(memId + "은(는) 없는 회원ID입니다.");
            System.out.println("수정 작업을 중단합니다.");
            return;
        }

        int num; // 수정할 컬럼에 대한 선택 값이 저장될 변수
        String updateField = null; // 업데이트 될 컬럼 이름
        String updateTitle = null;
        do {
            System.out.println();
            System.out.println("수정할 항목을 선택하세요.");
            System.out.println(" 1.회원이름  2.비밀번호  3.전화번호  4.회원주소");
            System.out.println("----------------------------------------------");
            System.out.print("수정할 항목 선택 >> ");
            num = scan.nextInt();

            switch (num) {
                case 1:
                    updateField = "mem_name"; // 컬럼이름
                    updateTitle = "회원이름";
                    break;
                case 2:
                    updateField = "mem_pass";
                    updateTitle = "비밀번호";
                    break;
                case 3:
                    updateField = "mem_tel";
                    updateTitle = "전화번호";
                    break;
                case 4:
                    updateField = "mem_addr";
                    updateTitle = "회원주소";
                    break;
                default:
                    System.out.println("수정할 항목을 잘못 선택했습니다.");
                    System.out.println("다시 선택하세요.");
            }
        } while (num < 1 || num > 4);

        scan.nextLine();  // 입력 버퍼 비우기
        System.out.println();
        System.out.print("새로운 " + updateTitle + " >> ");
        String updateData = scan.nextLine();


    }

    // 메뉴를 출력하고 선택한 작업 번호를 반환하는 메서드
    private int displayMenu(){
        System.out.println();
        System.out.println("== 작업 선택 ==");
        System.out.println("1. 자료 추가 ");
        System.out.println("2. 자료 삭제");
        System.out.println("3. 자료 수정");
        System.out.println("4. 전체 자료 출력");
        System.out.println("5. 자료 수정2");
        System.out.println("0. 작업 끝.");
        System.out.println("==================");
        System.out.print("원하는 작업 선택 >> ");
        int num = scan.nextInt();
        return num;
    }
}