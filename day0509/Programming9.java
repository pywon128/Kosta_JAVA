import java.util.Scanner;

class Programming9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double num, result;
		System.out.print("x 값 입력(실수) : ");
		num = sc.nextDouble();
		
		
		

		if (num <= 0)
		{
			result = num*num*num-9*num+2;
		}else{
			result = 7*num +2;
		}

		System.out.println(result);
		

	}
}
