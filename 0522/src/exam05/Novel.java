package exam05;

public class Novel extends Book{
    public static final int FEES = 300;
    private int price;

    public Novel(String number, String title, String author) {
        super(number, title, author);
    }
    public Novel() {
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void getLateFees(int days) {
        price = FEES*days;
        System.out.println(title+" 연체료 : "+price);
    }
}
