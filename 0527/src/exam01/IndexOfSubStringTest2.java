package exam01;

import java.util.Scanner;

public class IndexOfSubStringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이메일 입력 : ");
        String email = sc.next();
        String id = email.substring(0, email.indexOf("@"));
        System.out.println("id = " + id);
    }
}