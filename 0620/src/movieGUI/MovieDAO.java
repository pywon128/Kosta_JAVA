package movieGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieDAO {
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USERNAME = "c##madang";
    private static final String PASSWORD = "madang";

    public static ArrayList<MovieVO> search(String theaterName){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<MovieVO> movieVO = new ArrayList<>();

        String sql = "SELECT tl.TNAME, COUNT(r.TCNO), SUM(t.PRICE) "
                + "FROM THEATER_LOCATION tl, THEATER t, RESERVATION r "
                + "WHERE tl.TLNO = t.tlno AND t.TNO = r.TNO AND tl.TNAME = '"+theaterName+"' "
                + "GROUP BY tl.TNAME "
                + "ORDER BY tl.TNAME";

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                movieVO.add(new MovieVO(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3)
                ));
            }
        }catch (Exception e1){ System.out.println(e1.getMessage()); }
        finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                if (rs != null) rs.close();
            } catch (Exception e2){ System.out.println(e2.getMessage()); }
        }
        return movieVO;
    }
}