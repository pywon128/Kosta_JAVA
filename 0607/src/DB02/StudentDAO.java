package DB02;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USERNAME = "c##madang";
    public static final String PASSWORD = "madang";

    //모든 학생의 정보를 조회하여 ArrayList로 반환하는 메서드
    public ArrayList<StudentVO> listSutent(){
        ArrayList<StudentVO> lists = new ArrayList<>();
        String sql = "select * from student";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                lists.add(new StudentVO(rs.getString(1),
                                        rs.getInt(2),
                                        rs.getInt(3),
                                        rs.getInt(4)));
            }

        }catch (Exception e1){
            System.out.println("예외 발생 : "+e1.getMessage());
        }finally{
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e2){
                System.out.println("예외 발생 : "+e2.getMessage());
            }
        }

        return lists;
    }

    public int insertStudent(StudentVO studentVO){
        Connection conn = null;
        Statement stmt = null;

        int re = -1;
        try {
            String sql = "insert into student values('"+studentVO.getName()+"',"+studentVO.getKor()+","
                    +studentVO.getEng()+","+studentVO.getMath()+")";

            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println("예외 발생 : "+e1.getMessage());
        }finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e2){
                System.out.println("예외 발생 : "+e2.getMessage());
            }
        }
        return re;
    }

    //학생의 정보를 수정하는 메서드
    public int updateStudent(StudentVO studentVO){
        int re = -1;
        Connection conn = null;
        Statement stmt = null;

        String sql = "update student set kor="+studentVO.getKor()+", eng="+studentVO.getEng()
                +", math="+ studentVO.getMath()+" where name = '"+ studentVO.getName()+"'";

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println("예외 발생 : "+e1.getMessage());
        }finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }catch (Exception e2){
                System.out.println("예외 발생 : "+e2.getMessage());
            }
        }
        return re;
    }
    public static int deleteStudent(String name) {
        int re = -1;
        String sql = "delete student where name='"+name+"'";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println("예외 발생 : "+e1.getMessage());
        }finally{
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e2){
                System.out.println("예외 발생 : "+e2.getMessage());
            }
        }

        return re;
    }
}