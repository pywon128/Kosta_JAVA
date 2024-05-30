import java.util.Scanner;

class Avg02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int d,m,s, avg;
		System.out.print("아빠 나이 입력 : ");
		d = sc.nextInt();
		System.out.print("엄마 나이 입력 : ");
		m = sc.nextInt();
		System.out.print("아들 나이 입력 : ");
		s = sc.nextInt();
		
		avg = (d+m+s)/3;

		System.out.println("평균 : "+avg); 

	}
}