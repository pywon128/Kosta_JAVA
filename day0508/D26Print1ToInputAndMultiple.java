import java.util.Scanner;
class D26Print1ToInputAndMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, num=1;
		System.out.print("숫자 입력 : ");
		input = sc.nextInt();
		while(num<=input){
			if (num % 3 == 0){
				System.out.printf("%5d",num);
			}
			num = num +1;
		}
	}
}