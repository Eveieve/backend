package day33_0228.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection conn = null;



        public  static Connection getConnection() {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madangdb?serverTimeZone=Asia/Seoul", "madang", "madang");
                System.out.println("Driver loaded");
                return conn;

                //System.out.println("Connection" + conn);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);

            } catch (SQLException e) {
                throw new RuntimeException(e);
//            }finally{
//                if(conn != null){
//                    try {
//                        conn.close(); // 닫는 과정에서 에러발생 가능 - 캐치 블럭 만들기
//                        System.out.println("closed");
//                    } catch (SQLException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//            }
            }

        }
    }

