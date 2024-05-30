import java.util.Scanner;

public class ProgrammingTen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start, end, gas, km;
		
		System.out.print("출발한 지점의 주행 거리계 : ");
		start = sc.nextInt();
		System.out.print("도착한 지점의 주행 거리계 : ");
		end = sc.nextInt();
		System.out.print("사용한 연료 : ");
		gas = sc.nextInt();
		km = (end - start) / gas;
		
		System.out.println("연비는 "+km+"km/l 입니다.");
		
		
	}
}