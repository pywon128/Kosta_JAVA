import java.util.Scanner;
class  D34Sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for (int i = 10; i<=30; i++ )
		{
			for (int j = 0; j<=5 ; j++)
			{
				sum += (i*j);
			}
		}
		System.out.println(sum);
	}
}
