import java.util.Scanner;

class D05SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		/*
		System.out.print("0~9 사이의 수를 입력 ==> ");
		n = sc.nextInt();
		*/

		switch (n){
		case 4 : 
			case 5:
		case 6 : System.out.println("여섯"); break;
		case 7 : System.out.println("칠"); break;
		case 0 : 
		case 1 : 
		case 2 : System.out.println("둘"); break;
		case 3 : System.out.println("삼"); break;
		case 8 : 
		case 9 : System.out.println("구"); break;
		default : System.out.println("입력범위 초과");
		}
		System.out.println("작업종료");
	
	}
}
