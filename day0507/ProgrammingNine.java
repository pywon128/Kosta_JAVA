import java.util.Scanner;

public class ProgrammingNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, count04, count03, count02, count01;	
		System.out.print("정수를 입력하시오 : ");
		num = sc.nextInt();
		
		count04 = num/1000;
		count03 = (num%1000)/100;
		count02 = (num%100)/10;
		count01 = num%10;
		
		System.out.println("천의 자리 : "+count04);
		System.out.println("백의 자리 : "+count03);
		System.out.println("십의 자리 : "+count02);
		System.out.println("일의 자리 : "+count01);
		
		
	}
}
