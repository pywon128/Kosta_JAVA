import java.util.Scanner;
import java.util.Date;

public class D11CancerTest {
	public static void main(String[] args){
		String n;
		String result = "무료암검진 대상자가 아닙니다.";
		int age, yyyy, thisYear;
		Scanner sc = new Scanner(System.in);
		Date today = new Date();

		thisYear = today.getYear()+1900;

		System.out.print("이름을 입력하세요 ==> ");
		n = sc.next();
		System.out.print("출생연도를 입력하세요 ==> ");
		yyyy = sc.nextInt();
		
		age = (thisYear-yyyy)+1;

		boolean asd;
		asd = yyyy%2==0&age>=40;
		System.out.println(asd);
	/*
		if( yyyy%2 == 0 & age >= 40){
			result = "무료암검진 대상자 입니다.";
		}
		System.out.println("*** 무료 암검진 판별 결과 ***");
		System.out.println("올해연도 : "+thisYear);
		System.out.println("출생연도 : "+yyyy);
		System.out.println("이름 : "+n);
		System.out.println("나이 : "+age);
		System.out.println(result);
		*/
	
		
	}
}