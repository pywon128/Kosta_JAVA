import java.util.Scanner;
class  D31PrimeNumberTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		
		int i;
		for (i = 2; i<n; i++){
			if (n%i == 0)
			{
				break;
			}
		}
		if (n == i ){
			System.out.printf("%d는 소수 입니다",n);
		} else{
			System.out.printf("%d는 소수가 아닙니다",n);
		}
	}
}