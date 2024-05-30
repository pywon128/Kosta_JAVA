import java.util.Scanner;
class D04Score 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, result = "불합격";
		int k, e, m, tot, avg;
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		k = sc.nextInt();
		System.out.print("영어 점수 : ");
		e = sc.nextInt();
		System.out.print("수학 점수 : ");
		m = sc.nextInt();
		tot = k+e+m;
		avg = tot/3;

		if (avg>=60 && k >= 40 && e >= 40 && m >= 40)
		{
			result = "합격!";
		}
		System.out.println(result);

	}
}
