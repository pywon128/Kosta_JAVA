import java.util.Scanner;
class  D30PrimeNumberTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt=0;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i<n; i++ ){
			if (n%i == 0){
				isPrime = false;
				break;
			}
		}
		if (isPrime)
		{
			System.out.printf("%d는 소수입니다");
		}else{
			System.out.printf("%d는 소수가 아닙니다");
		}
		
	}
}