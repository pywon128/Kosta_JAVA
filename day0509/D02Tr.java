import java.util.Scanner;
class  D02Tr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		double c;
		
		System.out.print("가로 길이 입력 : ");
		a = sc.nextInt();
		System.out.print("세로 길이 입력 : ");
		b = sc.nextInt();
		c = (double)a*b/2;

		System.out.println("*** 출력 ***");
		System.out.printf("면적은 : %.2f",c);		
	}
}
