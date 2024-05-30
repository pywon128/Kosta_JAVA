import java.util.Scanner;

class D15ForTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i<=n;  i++){
			if (i%2 == 1)
			{
				System.out.print(i);
			}
		}		
	}
}