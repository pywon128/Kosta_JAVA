import java.util.Scanner;
class D05Spr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.print("출생월 : ");
		m = sc.nextInt();

		if (m < 1 || m > 12)
		{
			System.out.println("월을 똑바로 입력하세요!");
			return;
		}

		if (m >=3 && m <=5)
		{
			System.out.println("봄에 태어남");
		}else{
			System.out.println("봄에  안태어남");
		}
	}
}