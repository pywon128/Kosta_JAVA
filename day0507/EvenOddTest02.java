// 사용자에게 임의의 수 n을 입력 받아 짝수인지 홀수인지 판별하는 프로그램

import java.util.Scanner;

public class EvenOddTest02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		String result = "";

		System.out.print("임의의수 N을 입력하세요 ==> ");
		n = sc.nextInt();
		if(n%2==0){
			result = "짝수";
		}else{
			result = "홀수";
		}
		
		System.out.println(result);
	}
}