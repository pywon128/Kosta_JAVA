package DB04;

import java.sql.*;
import java.util.ArrayList;

public class GoodsDAO {
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USERNAME = "c##madang";
    public static final String PASSWORD = "madang";

    // 선택한 행의 no, item, qty, price 를 TextFiled 에 출력하는 메서드
    public GoodsVO selectRow(int no){
        GoodsVO goodsVO =null;
        String sql = "select * from goods where no="+no;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                goodsVO = new GoodsVO(rs.getInt(1),
                                                rs.getString(2),
                                                rs.getInt(3),
                                                rs.getInt(4));
            }
            return goodsVO;
        }catch (Exception e1){
            System.out.println("예외 : "+e1.getMessage());
        }finally{
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e2){
                System.out.println("예외 : "+e2.getMessage());
            }
        }
        return null;
    }

    //모든 상품목록을 조회하여 ArrayList 로 반환하는 메서드를 정의
    public ArrayList<GoodsVO> goodsLists(){
        ArrayList<GoodsVO> lists = new ArrayList<>();
        String sql = "select * from goods";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                lists.add(new GoodsVO(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                        ));
            }
        } catch (Exception e1) {
            System.out.println("예외 : "+e1.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }catch (Exception e2){
                System.out.println("예외 : "+e2.getMessage());
            }
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

    public int updateGoods(GoodsVO goodsVO){
        int re = -1;
        String sql = "update goods set item='"+goodsVO.getItem()
                +"', qty="+goodsVO.getQty()+", price="+goodsVO.getPrice()+" where no="+goodsVO.getNo();
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            re  = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
        return re;
    }

    public int deleteGoods(int no){
        int re = -1;
        String sql = "delete goods where no="+no;
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            re = stmt.executeUpdate(sql);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally{
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
