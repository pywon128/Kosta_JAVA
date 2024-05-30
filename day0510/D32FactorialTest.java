import java.util.Scanner;
class D32FactorialTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f, sum=1;
		System.out.print("숫자 입력 : ");
		f = sc.nextInt();

		for (int i = f; i>=1; i-- ) {
			sum *= i;
			System.out.print(i);
			if (i != 1){
				System.out.print("*");
			}
		}
		
		System.out.print("=");
		System.out.print(sum);
	}
}
