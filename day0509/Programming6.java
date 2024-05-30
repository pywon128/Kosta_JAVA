import java.util.Scanner;

class Programming6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double cm, kg,basic;
		String result = "";
		System.out.print("키 입력 : ");
		cm = sc.nextInt();
		System.out.print("몸무게 입력 : ");
		kg = sc.nextInt();


		basic = (cm-100)*0.9;

		if (kg == basic) result = "표준체중";	
		else if (kg > basic) result = "과체중";
		else result = "저체중";
	
	System.out.println("표준체중 : "+basic);
	System.out.println(result);


	}
}
