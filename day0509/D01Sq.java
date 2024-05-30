import java.util.Scanner;
class  D01Sq{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		
		System.out.print("가로 길이 입력 : ");
		a = sc.nextDouble();
		System.out.print("세로 길이 입력 : ");
		b = sc.nextDouble();
		c = a*b;

		System.out.println("*** 출력 ***");
		System.out.printf("면적은 : %.2f",c);		
	}
}
