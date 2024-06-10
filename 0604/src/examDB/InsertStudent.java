/*
    자바에서 데이터베이스에 연결하는 프로그램
    Java DataBase connect 프로그램
    => JDBC
 */

package examDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();


//        String sql = "insert into student values('";
//        sql += name+"',";
//        sql += kor+",";
//        sql += eng+",";
//        sql += math+")";


        PreparedStatement pstmt = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            //1. jdbc 드라이버를 메모리로 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2. DB서버에 연결
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "c##madang";
            String password = "madang";
            conn = DriverManager.getConnection(url, username, password);

            String sql = "insert into student values(?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setInt(2,kor);
            pstmt.setInt(3,eng);
            pstmt.setInt(4,math);
            System.out.println(sql);
            int re = pstmt.executeUpdate();

            //3. 데이터베이스 명령어 실행 담당자 객체를 생성
//            stmt = conn.createStatement();
            //4. 실행담당자를 통해서 데이터베이스 명령어를 실행
            // 몇개의 작업을 했는지 파악하기 위한 변수 int re
//            int re = stmt.executeUpdate(sql);
//            System.out.println("작업 : "+re);
            if (re==1){
                System.out.println("레코드 추가 성공");
            } else {
                System.out.println("레코드 추가 실패");
            }

        }catch (Exception e){
            System.out.println("예외처리 : "+e.getMessage());
        } finally {
            try {
                //5. 사용했던 자원을 닫아준다.
                if (stmt != null){ stmt.close();}
                if (conn != null){ conn.close();}
            }catch (Exception ex){
                System.out.println("예외발생 : "+ex.getMessage());
            }

        }
    }
}
