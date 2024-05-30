package exam06;

// 소비자 클래스를 구체화
// 생산자와 상관없이 계속 제품을 소비 하도록 하기 위하여 멀티쓰레드가 되게 함
public class Consumer extends Thread{
    // 생산자와 제품을 공유하기 위하여 Product 객체를 생성
    private Product product;

    //생성시에 제품을 매개변수로 전달받아 초기화
    public Consumer(Product product) {
        this.product = product;
    }

    // run을 오버라이딩 하여 소비자가 해야 할 일을 작성
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10 ; i++) {
                product.useNumber();
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
