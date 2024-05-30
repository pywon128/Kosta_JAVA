import java.util.Scanner;

class  Programming3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input,p = 100;
		double sum;
		System.out.print("물건 수량 : ");
		input = sc.nextInt();
		sum = input*p;
		if (input >= 10)
		{
			sum -= (sum*0.1);
			System.out.println("수량 : "+input+"	금액 : "+sum);
		}else{
			System.out.println("수량 : "+input+"	금액 : "+sum);
		}
	}
}
