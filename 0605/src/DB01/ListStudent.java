package DB01;

import javax.xml.namespace.QName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudent {
    public static void main(String[] args) {
        String sql = "select * from student";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE","c##madang", "madang");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                String name = rs.getString(1);
                int kor = rs.getInt(2);
                int eng = rs.getInt(3);
                int math = rs.getInt(4);
                System.out.println(name+", "+kor+", "+eng+", "+math);
            }
        }catch (Exception e){
            System.out.println("예외 발생 : "+e.getMessage());
        }finally {
            try {
                if (conn != null) conn.close();
                if (stmt != null) stmt.close();
                if (rs != null) rs.close();
            }catch (Exception ex){
                System.out.println("예외 발생 : "+ex.getMessage());
            }
        }
    }
}
