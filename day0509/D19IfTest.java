import java.util.Scanner;

class  D19IfTest {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("임의의 수 입력 : ");
		num = sc.nextInt();

		if (num >= 0) num+=100;
		else num*=num;
		
		System.out.println(num);
		System.out.println("작업종료");
	}
}
