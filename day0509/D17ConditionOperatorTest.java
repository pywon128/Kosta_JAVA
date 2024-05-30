import java.util.Scanner;

class D17ConditionOperatorTest 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		b = sc.nextInt();
		
		System.out.println( (a>=b)? a: b);
		System.out.printf("%d",(a>=b)? a: b);

	}
}
