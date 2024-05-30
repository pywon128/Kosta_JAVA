package exam05;

public class ScienceFiction extends Book{
    public static final int FEES = 600;
    private int price;

    public ScienceFiction(String number, String title, String author) {
        super(number, title, author);
    }
    public ScienceFiction() {
    }

    @Override
    public String toString() {
        return "ScienceFiction{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void getLateFees(int days) {
        price = FEES*days;
        System.out.println(title+" 연체료 : "+price);
    }
}
