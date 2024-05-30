package exam08;

public class CountDownTest {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountDown2 countDown2 = new CountDown2(2,"연결장치 분리");

        new Thread(countDown).start();
        countDown2.start();

    }
}

