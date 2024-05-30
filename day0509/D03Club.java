import java.util.Scanner;
class  D03Club
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, result = "입장불가능";
		int age, k;
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("키 입력 : ");
		k = sc.nextInt();

		if (age >= 30 && k <= 170)
		{
			result = "입장가능";
		}
		System.out.println(result);
	}
}
