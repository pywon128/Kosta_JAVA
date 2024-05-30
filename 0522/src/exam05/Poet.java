package exam05;

public class Poet extends Book{
    public static final int FEES = 200;
    private int price;

    public Poet(String number, String title, String author) {
        super(number, title, author);
    }
    public Poet(){}

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Poet{" +
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
