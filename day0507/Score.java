import java.util.Scanner;

public class Score{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n;
		String result = "불합격";
		int a, b, c, tot, avg;
		
		System.out.print("이름을 입력하시오 ==> ");
		n = sc.next();
		System.out.print("국어점수를 입력하시오 ==> ");
		a = sc.nextInt();
		System.out.print("영어점수를 입력하시오 ==> ");
		b = sc.nextInt();
		System.out.print("수학점수를 입력하시오 ==> ");
		c = sc.nextInt();
		tot = a+b+c;
		avg = tot/3;
		
		if (avg >= 60){
			result = "합격";
		}	
		
		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("이름 : "+n);
		System.out.println("국어 : "+a);
		System.out.println("영어 : "+b);
		System.out.println("수학 : "+c);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("결과 : "+result);
	
	}
}