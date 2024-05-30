package exam05;

// 성금자를 위한 클래스( 전화(call())를 걸어서 모금액을 증가 )
// 다른 성금자와 관계없이 계속 입금을 하기 위하여 쓰레드를 상속
public class Person extends Thread{

    //성금자 이름
    String name;

    //다른 성금자와 모금액을 공유하기 위하여 모금액 클래스인 Account 를 생성
    Account account;

    //생성자
    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    // 성금자가 해야할 일을 run을 오버라이딩하여 써줌
    @Override
    public void run() {
        // 1000원씩 입금
        for (int i = 1; ; i++) {
            // 모금액이 500000원 이상이면 탈출
            if (account.getBalance() >= 300000){
                break;
            }

            account.call(name, i, 1000);
//            System.out.println(name+" 의 "+i+"번째 입금");
            try {Thread.sleep(700);}
            catch (InterruptedException e) { throw new RuntimeException(e); }
        }
//        System.out.println("전체 모금액 : "+account.getBalance());
    }
}
