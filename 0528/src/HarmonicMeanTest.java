// 사용자한테 두 수를 입력받아 "조화평균"을 구하여 출력하는 프로그램을 작성
import java.util.Scanner;

class HarmonicMeanTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, mean;
		System.out.print("첫 번째 수 입력 ==> ");
		a = sc.nextInt();
		System.out.print("첫 번째 수 입력 ==> ");
		b = sc.nextInt();

		mean = (2*a*b) / (a+b);
		System.out.print("두수의 조화평균은  "+mean);

	}
}
