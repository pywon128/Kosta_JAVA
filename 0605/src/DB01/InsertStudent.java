package DB01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;

        String name;
        int kor,eng,math;
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        name = sc.next();
        System.out.print("국어 점수 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수 : ");
        math = sc.nextInt();

        try {
            String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
            //1. jdbc 드라이버를 메모리로 로드한다.
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //2. DB서버에 연결한다.
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                    "c##madang", "madang");

            //3. 데이터베이스 명령어 실행 담당 객체를 생성
            stmt = conn.createStatement();

            //4. 데이터베이스 명령어를 실행
            int re = stmt.executeUpdate(sql);

            if (re == 1){
                System.out.println("레코드 추가 성공");
            } else {
                System.out.println("실패");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (stmt != null){
                    stmt.close();
                }
                if (conn != null){
                    conn.close();
                }
            }catch (Exception ex){
                System.out.println("예외발생 : "+ex.getMessage());
            }
        }
    }
}
