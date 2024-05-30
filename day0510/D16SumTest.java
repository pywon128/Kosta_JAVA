import java.util.Scanner;

class D16SumTest {
	public static void main(String[] args) {
		int n, oddsum=0, evensum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i<=n;  i++){
			if (i%2 == 1){
				oddsum += i;
			}
			else {
				evensum += i;
			}
		}
		System.out.printf("홀수의 합 : %d\n짝수의 합 : %d",oddsum, evensum);
	}
}