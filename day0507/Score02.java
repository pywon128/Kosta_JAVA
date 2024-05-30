import java.util.Scanner;

public class Score02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int pc, cL, eng, math;
		float avg;

		System.out.print("컴퓨터 개론 과목의 점수를 입력하시오 : ");
		pc = sc.nextInt();
		System.out.print("C언어 프로그래밍 과목의 점수를 입력하시오 : ");
		cL = sc.nextInt();
		System.out.print("영어 과목의 점수를 입력하시오 : ");
		eng = sc.nextInt();
		System.out.print("일반 수학 개론 과목의 점수를 입력하시오 : ");
		math = sc.nextInt();
		
		avg = (pc + cL + eng + math)/4;
			
		System.out.print("평균 점수는 "+avg+"점 입니다.");

	}
}