import java.io.IOException;
class Lab2_1 
{
	public static void main(String[] args) throws IOException {
		String s;
		System.out.printf("문자를 입력하시오 : ");
		char c = (char) System.in.read();

		if (c == 'a'){
			System.out.print("a");
		} else if (c == 'b'){
			System.out.print("b");
		} else if (c == 'c'){
			System.out.print("c");
		} else if (c == 'd'){
			System.out.print("d");
		} else if (c == 'e'){
			System.out.print("e");
		} else if (c == 'f'){
			System.out.print("f");
		} else{
			System.out.print("잘못된 입력 ");
		}
	}
}
