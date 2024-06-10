package DB03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GoodsDAO {
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USERNAME = "c##madang";
    public static final String PASSWORD = "madang";

    //새로운 상품을 등록하기 위한 메서드
    public int insertGoods(GoodsVO goodsVO){
        int re = -1;
        /*
        insertGoods 는 왜 int 를 반환하나요?
        executeUpdate 메서드는 성공적으로 명령을 실행한 건수를 반환하기 때문에
        레코드추가에 성공했는지 판별할 필요가 있기 때문에 int 를 반환
         */
        String sql = "insert into Goods values("+goodsVO.getNo()+",'"+goodsVO.getItem()+"',"
                +goodsVO.getQty()+","+goodsVO.getPrice()+")";
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        } finally{
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
        return re;
    }
}
