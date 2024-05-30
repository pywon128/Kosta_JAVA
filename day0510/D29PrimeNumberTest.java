import java.util.Scanner;
class  D29PrimeNumberTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt=0;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();

		for (int i = 1; i<=n; i++ ){
			if (n%i==0){
				cnt += 1;
			}
		}
		if (cnt ==  2){
			System.out.printf("%d는 소수 입니다.",n);
		}else{
			System.out.printf("%d는 소수가 아닙니다.",n);
		}
	}
}