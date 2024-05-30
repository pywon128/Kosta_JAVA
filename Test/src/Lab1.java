import java.util.Scanner;

class Lab1 {
	public static void main(String[] args) {
		int score;

		Scanner input = new Scanner(System.in);
		System.out.printf("성적을 입력하시오 : ");
		score = input.nextInt();
		
		System.out.println((score >= 60 )?  "합격\n축하합니다!":"불합격!");
	}
}
