import java.io.IOException;
class Lab2_2
{
	public static void main(String[] args) throws IOException {
		String s;
		System.out.printf("문자를 입력하시오 : ");
		char c = (char) System.in.read();


				switch (c)
		{
		case 'a': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'b': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'e': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'i': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'u': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'o': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'A': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'I': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'U': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'E': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		case 'O': System.out.printf("입력된 문자 %c은 모음입니다.",c); break;
		default : System.out.print("입력된 문자는 모음이 아닙니다. ");
		
		}

	}
}
