// 사용자한테 키를 입력받아 키가 170 이하 이면 "입장가능" 그렇지 않으면
// "입장불가능"을 출력
import java.util.Scanner;

class D34ClubEnter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double k;
		String enter = "입장불가능";
		System.out.print("키를 입력하세요 ==> ");
		k = sc.nextInt();
		if (k <=170){
			enter = "입장가능";
		}
		System.out.println(enter);
	}
}