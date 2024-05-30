import java.util.Scanner;
class D26PrintStar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.print("별을 몇개 출력할까요? ");
		s = sc.nextInt();

		for (int i=0; i<s; i++ )
		{
			System.out.print("*");
		}		
	}
}
