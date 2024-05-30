import java.util.Scanner;
class  D24DualIf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("1. 입력 : ");
		a = sc.nextInt();
		System.out.print("2. 입력 : ");
		b = sc.nextInt();
		System.out.print("3. 입력 : ");
		c = sc.nextInt();

		if (a>b){
			if (a>c){
				System.out.println(a);
			}else{
				System.out.println(c);
			}
		}else{
			if (b>c)
			{
				System.out.println(b);
			}else{
				System.out.println(c);
			}
		}
	}
}
