// 사용자한테 두 수를 입력받아 "조화평균"을 구하여 출력하는 프로그램을 작성
import java.util.Scanner;

//조화평균이 있을 수 없는 사용자 정의 예외를 만들어 봅시다.
class NotHarmonicMeanException extends Exception {
	public NotHarmonicMeanException(String message){
		super(message);
	}
}


class HarmonicMeanTest02 {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int a, b, mean;
			System.out.print("첫 번째 수 입력 ==> ");
			a = sc.nextInt();
			System.out.print("첫 번째 수 입력 ==> ");
			b = sc.nextInt();
			
			if (a == -b){
				throw new NotHarmonicMeanException(a+"와"+b+"의 조화평균을 있을 수 없어요");
			}	
			mean = (2*a*b) / (a+b);
			System.out.print("두수의 조화평균은  "+mean);
		}catch (NotHarmonicMeanException e ){
			System.out.println("예외발생 : "+e.getMessage());
		}
		

	}
}
