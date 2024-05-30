package exam05;

public class CountDownEventTest extends Thread{
    public static void main(String[] args) {
        CountDownEvent c = new CountDownEvent();
        c.start();
    }
}
