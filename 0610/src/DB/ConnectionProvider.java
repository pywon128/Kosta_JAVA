package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {


    public static Connection getConnection(){
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "c##madang";
        String password = "madang";

        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }

        return conn;
    }

    // 매개변수로 Connection 과 Statement, ResultSet 을 받아서 close 시켜주는 메서드로 반환값 x
    public static void closeMethod(Connection c, Statement s, ResultSet r){
        try {
            if (c != null) c.close();
            if (s != null) s.close();
            if (r != null) r.close();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
    }

    public static void closeMethod(Connection c, Statement s){
        try {
            if (c != null) c.close();
            if (s != null) s.close();
        } catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }

}
