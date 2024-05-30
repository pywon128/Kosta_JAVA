package exam08;

public class CountDown implements Runnable{
    @Override
    public void run() {
        for (int i = 20; i > 0 ; i--) {
            try{
                System.out.println(i+"초 전입니다.");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("발사!!");
    }
}
