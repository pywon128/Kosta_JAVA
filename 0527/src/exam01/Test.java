package exam01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String str1;
        String str2;

        Scanner sc = new Scanner(System.in);


        System.out.print("입력 : ");
        str2 = sc.nextLine();
        System.out.print("입력 : ");
        str1 = sc.nextLine();

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}