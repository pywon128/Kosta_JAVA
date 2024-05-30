import java.util.Scanner;

public class PersonInfo2 {
	public static void main(String[] args){
		String name;
		int age;
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력==> ");
		name = sc.next();
		
		System.out.print("나이를 입력==> ");
		age = sc.nextInt();
				
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"살 입니다.");
	}
}