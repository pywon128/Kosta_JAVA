package DB01;

import DB.ConnectionProvider;

import java.sql.*;
import java.util.ArrayList;

public class GoodsDAO {
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USERNAME = "c##madang";
    public static final String PASSWORD = "madang";

    //모든 상품목록을 조회하여 ArrayList 로 반환하는 메서드를 정의
    public ArrayList<GoodsVO> goodsLists(){
        ArrayList<GoodsVO> lists = new ArrayList<>();
        String sql = "select * from goods";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                lists.add(new GoodsVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                        ));
            }
        } catch (Exception e1) {
            System.out.println("예외 : "+e1.getMessage());
        }finally {
            ConnectionProvider.closeMethod(conn, stmt, rs);
        }

        return lists;
    }

    //새로운 상품을 등록하기 위한 메서드
    public int insertGoods(GoodsVO goodsVO){
        int re = -1;
        /*
        insertGoods 는 왜 int 를 반환하나요?
        executeUpdate 메서드는 성공적으로 명령을 실행한 건수를 반환하기 때문에
        레코드추가에 성공했는지 판별할 필요가 있기 때문에 int 를 반환
         */
        String sql = "insert into goods values("+goodsVO.getNo()+",'"+goodsVO.getItem()+"',"
                +goodsVO.getQty()+","+goodsVO.getPrice()+")";

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        } finally{
            ConnectionProvider.closeMethod(conn, stmt);
        }
        return re;
    }

    public int updateGoods(GoodsVO goodsVO){
        int re = -1;
        String sql = "update goods set item='"+goodsVO.getItem()
                +"', qty="+goodsVO.getQty()+", price="+goodsVO.getPrice()+" where no="+goodsVO.getNo();

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = ConnectionProvider.getConnection();
            stmt = conn.createStatement();
            re  = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally {
            ConnectionProvider.closeMethod(conn, stmt);
        }
        return re;
    }

    public int deleteGoods(int no){
        int re = -1;
        String sql = "delete goods where no="+no;

        Connection conn = ConnectionProvider.getConnection();
        Statement stmt = null;

        try {
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally{
            ConnectionProvider.closeMethod(conn,stmt);
        }
        return re;
    }
}
