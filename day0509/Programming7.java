import java.util.Scanner;
class  Programming7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.print("첫 번째 숫자 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		b = sc.nextInt();
		System.out.print("세 번째 숫자 : ");
		c = sc.nextInt();

		if (a>b && a>c)
		{
			max = a;
		}else if (b>a && b>c)
		{
			max = b;
		}else{
			max = c;
		}
		System.out.println("숫자 3개중 가장 큰 수는 : "+max);
	}
}
