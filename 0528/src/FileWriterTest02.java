import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest02
{
	public static void main(String[] args) 
	{
		try{

			//FileWriter fw = new FileWriter("c:/data/hello.txt");
			FileWriter fw = new FileWriter("c:/datx/hello.txt");
			fw.write("hello java");
			fw.close();
			System.out.println("파일을 생성하였습니다.");
		}
		catch (IOException e)
		{
			System.out.println("예외 발생");
			System.out.println(e);
		}
	}
}