package exam05;

// 모금액을 위한 클래스
public class Account {

    // 잔액을 위한 변수
    private int balance;

    // 입금을 위한 메서드
    // 임계영역 설정을 위하여 synchronized 키워드를 붙여 줌
//    public synchronized void call(String name, int n, int amount){
//        System.out.println(name+" 의 "+n+" 번째 입금");
//        if (balance >= 300000){
//            System.out.println("입금 실패");
//            return;
//        }
//        balance += amount;
//        System.out.println("---------------------------------------------");
//    }
    public void call(String name, int n, int amount){
        synchronized (this){
            System.out.println(name+" 의 "+n+" 번째 입금");
            if (balance >= 300000){
                System.out.println("입금 실패");
                return;
            }
            balance += amount;
            System.out.println("---------------------------------------------");
        }
    }

    // 현재 잔액을 반환하는 메서드
    public int getBalance(){
        return balance;
    }

}
