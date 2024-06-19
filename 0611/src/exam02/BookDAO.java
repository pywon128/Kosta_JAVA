package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USERNAME = "c##madang";
    private static final String PASSWORD = "madang";

    public static ArrayList<BookVO> search(String publisher){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<BookVO> bookVO = new ArrayList<>();

        String sql = "select b.bookid, bookname, price, saleprice, orderdate, c.custid, name, phone, publisher "
                + "from customer c, orders o, book b "
                + "where c.custid = o.custid and b.bookid = o.bookid "
                + "and publisher = '" + publisher + "'";

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
//                System.out.println(String.valueOf(rs.getDate(5)));
                bookVO.add(new BookVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        String.valueOf(rs.getDate(5)),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                if (rs != null) rs.close();
            } catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
        return bookVO;
    }
}
