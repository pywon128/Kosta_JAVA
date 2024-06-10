package DB01;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;


// 사용자한테 이름을 입력받아 그 이름에 해당하는 학생의 정보를 조회하여 출력하는 프로그램
// SELECT * FROM student WHERE name = ' '
public class FindStudentByName {
    public static void main(String[] args) {
        String sql = "select * from student where name=";
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        try {
            sql += "'"+name+"'";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang"
            );
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1)+", "+rs.getInt(2)+", "+
                        rs.getInt(3)+", "+rs.getInt(4));
            }

        } catch (Exception e){
            System.out.println("예외 발생 : "+e.getMessage());
        }finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
                if (rs != null) rs.close();
            }catch (Exception ex){
                System.out.println("예외 발생 : "+ex.getMessage());
            }
        }
    }
}
