package DB03;

public class GoodsVO {
    private int no;
    private String item;
    private int qty;
    private int price;


    public GoodsVO() {
    }
    public GoodsVO(int no, String item, int qty, int price) {
        this.no = no;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }


    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
