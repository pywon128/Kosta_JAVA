import java.util.Scanner;
class  D40WhileTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, v, i=0, j=0;
		System.out.print("별 몇줄 출력 : ");
		h = sc.nextInt();
		System.out.print("별 몇칸 출력 : ");
		v = sc.nextInt();
		while (i < h){
			while (j < v)
			{
				System.out.print("*");
				j++;
			}
			j = 0;
			System.out.println();
			i++;			
		}
	}
}