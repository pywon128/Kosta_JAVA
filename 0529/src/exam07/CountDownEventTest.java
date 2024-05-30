package exam07;

public class CountDownEventTest {
    public static void main(String[] args) {
        CountDownEvent c = new CountDownEvent(5, "발사!");
        c.start();
    }
}
