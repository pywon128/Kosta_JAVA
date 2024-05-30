import java.util.Scanner;
class D25DigitToKorTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("0~9까지 숫자 입력 : ");
		a = sc.nextInt();
		
		if (a == 0){
			System.out.println("영");
		}else if (a == 1){
			System.out.println("하나");
		}else if (a == 2){
			System.out.println("둘");
		}else if (a == 3){
			System.out.println("삼");
		}else if (a == 4){
			System.out.println("넷");
		}else if (a == 5){
			System.out.println("오");
		}else if (a == 6){
			System.out.println("여섯");
		}else if (a == 7){
			System.out.println("칠");
		}else if (a == 8){
			System.out.println("팔");
		}else{
			System.out.println("구");			
		}
		
	}
}
