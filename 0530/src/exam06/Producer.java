package exam06;

// 생산자 클래스를 만듦
// 소비자와 상관없이 계속 새로운 제품을 생산하게 하기 위하여
// Thread 클래스를 상속받아 멀티 쓰레드가 가능하도록 함
public class Producer extends Thread{
    // 제품을 맴버변수로 선언
    private Product product;

    // 생성시에 제품을 매개변수로 전달받아 초기화
    // 이 제품이 소비자와 공유하는 자원
    public Producer(Product product) {
        this.product = product;
    }
    // 생산자 쓰레드가 해야 할 일을 run 을 오버라이딩 하여 써줌

    @Override
    public void run() {
        // 10개의 새로운 제품을 생산하도록 함
        for (int i = 1; i <= 10 ; i++) {
            try{
                product.makeNumber();
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
