import java.util.Scanner;

class D10CharCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0, i=0;
		char ch;
		String input;
		System.out.print("문자열 입력 : ");
		input = sc.next();

		while(i<input.length()){
			ch = input.charAt(i);
			if (ch == 'A'){
				count = count + 1;
			}
			i = i+1;
		}
		System.out.println("대문자 개수 : "+count+"개");
	}
}