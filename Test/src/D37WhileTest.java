import java.util.Scanner;
class  D37WhileTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i = 1;
		System.out.print("몇단 출력 : ");
		n = sc.nextInt();
		System.out.printf("*** %d 단 ***\n",n);
		while (i<=9){
			System.out.printf("%d * %d = %d\n",n,i,n*i);
			i++;
		}
	}
}