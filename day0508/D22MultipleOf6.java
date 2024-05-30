// 사용자 한테 임의의 수 N을 입력 받아
// 그 수가 6의 배수인지 판별하여 적합한 메시지를 출력하는 프로그램
import java.util.Scanner;
class D22MultipleOf6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		if (n%6==0){
			System.out.println(n+"은 6의 배수 입니다.");
		}else{
			System.out.println(n+"은 6의 배수가 아닙니다.");
		}
	}
}