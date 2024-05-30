import java.io.IOException;
class Lab2 
{
	public static void main(String[] args) throws IOException {
		String s;
		System.out.printf("문자를 입력하시오 : ");
		char c = (char) System.in.read();

		switch (c)
		{
		case 'a': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'b': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'c': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'd': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'e': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'f': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		default : System.out.print("잘못된 입력입니다.");
		
		}
	}
}
