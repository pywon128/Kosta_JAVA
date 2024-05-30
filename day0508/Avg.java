import java.util.Scanner;

class Avg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int d,m,s, avg;
		System.out.print("D : ");
		d = sc.nextInt();
		System.out.print("M : ");
		m = sc.nextInt();
		System.out.print("S : ");
		s = sc.nextInt();
		
		avg = (d+m+s)/3;

		System.out.println("AVG : "+avg); 

	}
}