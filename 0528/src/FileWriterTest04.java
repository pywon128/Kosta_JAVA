import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest04
{

	public static void pro(String fname) throws IOException{
		FileWriter fw = new FileWriter(fname);
		fw.write("hello java");
		fw.close();
		System.out.println("파일을 생성하였습니다.");
	}

	public static void main(String[] args) {
		try{
			pro("c:/datx/hello.txt");
		}
		catch (IOException e){
			e.printStackTrace();  // 예외가 발생하면 어디에서 문제가 발생하였는지 추적해 가면서 정보를 출력해 줌
			//System.out.println("예외 발생 : "+ e);
		}
	}
}