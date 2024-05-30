import java.util.Scanner;

class D14ForTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i<=n;  i=i+2){
			System.out.print(i);
		}		
	}
}