package file;

import java.util.Scanner;

public class FileTest01 {
    public static void main(String[] args) {
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
    }
}
