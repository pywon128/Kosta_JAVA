import java.util.Scanner;

class D02DigitToKorIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9 사이의 수를 입력 ==> ");
		n = sc.nextInt();

		switch (n){
		case 0 :
			System.out.println("영");
			break;
		case 1 :
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		case 3 :
			System.out.println("삼");
		case 4 :
			System.out.println("넷");
			break;
		case 5 :
			System.out.println("오");
			break;
		case 6 :
			System.out.println("여섯");
			break;
		case 7 :
			System.out.println("칠");
			break;
		case 8 :
			System.out.println("팔");
			break;		
		case 9 :
			System.out.println("구");
		default :
			System.out.println("입력범위 초과");
		}
			
			

			

			

			

			

			

			


	}
}
