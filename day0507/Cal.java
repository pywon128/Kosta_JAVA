import java.util.Scanner;

public class Cal{
	public static void main(String[] args){
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 ==> ");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 ==> ");
		b = sc.nextInt();
		System.out.println("*** 사칙 연산 결과 ***");
		System.out.println(a +"+"+ b+"="+(a+b));
		System.out.println(a +"-"+ b+"="+(a-b));
		System.out.println(a +"*"+ b+"="+(a*b));
		System.out.println(a +"/"+ b+"="+(a/b));
		
		
	}

}