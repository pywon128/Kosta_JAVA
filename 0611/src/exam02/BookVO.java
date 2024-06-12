package exam02;

public class BookVO {
    private int bookNo;
    private String bookName;
    private int bookPrice;
    private int salePrice;
    private String saleDate;
    private int customerNo;
    private String customerName;
    private String customerPhone;
    private String publisher;

    public BookVO(int bookNo, String bookName, int bookPrice, int salePrice, String saleDate,
                  int customerNo, String customerName, String customerPhone, String publisher) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.salePrice = salePrice;
        this.saleDate = saleDate;
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.publisher = publisher;
    }

    public int getBookNo() {
        return bookNo;
    }
    public String getBookName() {
        return bookName;
    }
    public int getBookPrice() {
        return bookPrice;
    }
    public int getSalePrice() {
        return salePrice;
    }
    public String getSaleDate() {
        return saleDate;
    }
    public int getCustomerNo() {
        return customerNo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public String getPublisher() {
        return publisher;
    }
}
