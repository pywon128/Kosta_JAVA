import java.util.Scanner;
class  D28DivisorsTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();

		for (int i = 1; i<=n ; i++){
			if (n%i == 0){
				System.out.print(i+"  ");
			}
		}
	}
}