package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name, addr, phone;

        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("주소 : ");
        addr = sc.next();
        System.out.print("전화번호 : ");
        phone = sc.next();

        System.out.println("이름 = " + name);
        System.out.println("주소 = " + addr);
        System.out.println("전화번호 = " + phone);

        try{
//            FileWriter fw = new FileWriter("C:/data/info.txt");
            // 파일을 생성하면 기본적으로 기존의 파일을 덮어쓰기 함
            FileWriter fw = new FileWriter("C:/data/info.txt", true);
            // 파일 생성시에 두번째 매개변수(append mode)에 true 를 주게되면
            // 그 파일이 없다면 새로 만들고 있다면 내용을 추가함
            fw.write("이름 : "+name+"\n");
            fw.write("주소 : "+addr+"\n");
            fw.write("전화 : "+phone+"\n");

            fw.close();
            System.out.println("파일이 생성 되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
