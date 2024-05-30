import java.util.Scanner;

class  D20IfTest {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("임의의 수 입력 : ");
		num = sc.nextInt();

		if (num < 0) num*=num;
		
		System.out.println(num);
	}
}
