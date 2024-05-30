import java.util.Scanner;

public class Check {
	public static void main(String[] args){
		String n;
		String result = "무료암검진 대상자가 아닙니다.";
		int age, yyyy;
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 ==> ");
		n = sc.next();
		System.out.print("출생연도를 입력하세요 ==> ");
		yyyy = sc.nextInt();
		
		age = (2024-yyyy)+1;
		
		if( age >= 40){
			result = "무료암검진 대상자 입니다.";
		}
		System.out.println("*** 무료 암검진 판별 결과 ***");
		System.out.println("이름 : "+n);
		System.out.println("나이 : "+age);
		System.out.println(result);
		
	}
}