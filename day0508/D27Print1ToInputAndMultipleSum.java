import java.util.Scanner;
class D27Print1ToInputAndMultipleSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, sum=0, num=1;
		System.out.print("숫자 입력 : ");
		input = sc.nextInt();
		while(num<=input){
			if (num % 3 == 0){
				sum = sum + num;
			}
			num = num +1;
		}
		System.out.printf("%d",sum);
	}
}