package file;

// C:/data/info.txt 파일의 내용을 메모리로 읽어들여
// 화면에 출력하는 프로그램

import java.io.FileReader;

public class FileReaderTest03 {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("C:/data/info.txt");
            int ch;
            String data = "";
            while ((ch=fr.read()) != -1){
                ch = fr.read();
                data += (char)ch;
//                System.out.print((char) ch);
            }
            System.out.println(data);

//            for (int i = 0; ; i++) {
//                ch = fr.read();
//                if (ch==-1){ break; }
//                System.out.print((char) ch);
//            }

            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
