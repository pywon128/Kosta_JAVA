package exam06;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("java", 300, "as");
        Magazine m = new Magazine("asd", 300, "as", "5월5일");
        Magazine m1 = new Magazine();

        Book b1 = new Book();
        System.out.println(b1);
        System.out.println(b);
        System.out.println(m);
    }
}
