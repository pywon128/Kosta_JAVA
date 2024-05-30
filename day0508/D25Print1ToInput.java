import java.util.Scanner;

class D25Print1ToInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int num=1;

		System.out.print("숫자 입력 : ");
		input = sc.nextInt();

		while(num<=input){
				System.out.printf("%5d",num);
				num = num +1;
		}
	}
}