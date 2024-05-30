import java.util.Scanner;
class  D33Sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for (int i = 1; i<=30; i++ )
		{
			sum += (i*i+1);
		}
		System.out.println(sum);
	}
}
