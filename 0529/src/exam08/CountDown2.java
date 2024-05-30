package exam08;

public class CountDown2 extends Thread {
    private int delay;
    private String message;

    public CountDown2(int delay, String message) {
        this.delay = delay;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.delay*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.message);
    }
}
