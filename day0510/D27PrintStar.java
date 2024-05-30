import java.util.Scanner;
class D27PrintStar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int H, V;
		System.out.print("별을 몇줄 출력할까요? ");
		H = sc.nextInt();
		System.out.print("별을 몇칸 출력할까요? ");
		V = sc.nextInt();

		for (int i=0; i<H; i++ ){
			for (int j =0; j<V; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
