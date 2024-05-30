import java.util.Scanner;

class D20StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int k, e, m, tot;
		double avg;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 입력 : ");
		k = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		e = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		m = sc.nextInt();
		tot = k+e+m;
		avg = tot/3.0;
		
		System.out.println("*** 결과 ***");
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+k);
		System.out.println("영어 : "+e);
		System.out.println("수학 : "+m);
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : %.1f",avg);
	}
}
