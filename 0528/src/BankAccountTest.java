import java.util.Scanner;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String message){
		super(message);
	}
}

class BankAccount {
	int balance =0;
	public BankAccount(int balance){
		this.balance = balance;
		System.out.println("현재 잔액 : "+this.balance);
	}
	public void deposit(int in) throws NegativeBalanceException{
		this.balance += in;
		System.out.println("입금 후 잔액 : "+this.balance);
	}
	public void withdraw(int out) throws NegativeBalanceException { 
		System.out.println("현재 잔액 : "+this.balance+" 출금 금액 : "+out);
		this.balance -= out; }
	public int getBalance(){
		return this.balance;
	}

}

class  BankAccountTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in, out, sel;
		BankAccount bA = new BankAccount(10000);
			while (true) {
				System.out.print("1.입금 2.출금 3.잔고조회");
				System.out.print("선택 : ");
				sel = sc.nextInt();
				if (sel == 0) {
					break;
				}
				try {
					switch (sel) {
						case 1:
							System.out.print("입금 : ");
							in = sc.nextInt();
							if (!(in < 0)) {
								bA.deposit(in);
							} else {
								throw new NegativeBalanceException("잘못된 입금입니다.");
							}
							break;
						case 2:
							System.out.print("출금 : ");
							out = sc.nextInt();
							if (bA.getBalance() < out) {
								throw new NegativeBalanceException("잔액이 부족합니다");
							} else {
								bA.withdraw(out);
							}
							break;
						case 3:
							System.out.println("현재 잔액 : " + bA.getBalance());
							break;
					}
				}
				catch (NegativeBalanceException e){
//					e.printStackTrace();
					System.out.println("예외 발생 : "+e.getMessage());
				}
//				System.out.println("잔액 : "+bA.getBalance());
			}
	}
}
