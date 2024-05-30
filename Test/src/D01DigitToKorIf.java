import java.util.Scanner;

class D01DigitToKorIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9 사이의 수를 입력 ==> ");
		n = sc.nextInt();
		if (n==0){
			System.out.println("영");
		} else if (n == 1)	{
			System.out.println("하나");
		} else if (n == 2)	{
			System.out.println("둘");
		} else if (n == 3)	{
			System.out.println("삼");
		} else if (n == 4)	{
			System.out.println("넷");
		} else if (n == 5)	{
			System.out.println("오");
		} else if (n == 6)	{
			System.out.println("여섯");
		} else if (n == 7)	{
			System.out.println("칠");
		} else if (n == 8)	{
			System.out.println("팔");
		} else if (n == 9)	{
			System.out.println("구");
		} else {
			System.out.println("입력범위 초과");
		}

	}
}
