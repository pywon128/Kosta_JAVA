public class BankAccount {
    private double balance;
    private double rate= 7.5;

    // addInterest 메서드의 동작방식을 변경했을 때 호출한 쪽에서 수정할 부분 없음
    // 그러나 맴버변수인 balance 의 자료형은 int에서 double 로 변경하면 호출한 쪽에서도 수정해줘야 함
    public double getBalance() {
        return balance;
    }

    // int는 double에 포함이 된다
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void printBalance(){
        System.out.println("현재 잔액 : "+balance);
    }

    // 현재 잔액에 대하여 연 7.5%의 이자를 계산하여 추가하는 메서드
    public void addInterest(){
        this.balance += (balance*rate)/100;
        System.out.println("이율 계산 후 잔액 : "+this.balance);
    }

    public void withDraw(int money){
        System.out.println("인출 금액 : "+money);
        // 잔액보다 더 큰 금액은 인출이 되지 않도록 함
        if (balance < money){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.balance -= money;
    }

    public void deposit(int money){
        System.out.println("입금 금액 : "+money);
        this.balance += money;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
