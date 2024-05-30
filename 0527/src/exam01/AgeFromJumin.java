package exam01;

//사용자 한테 주민번호를 입력받아서 나이를 게산하여 출력하는 프로그램

import java.util.Date;
import java.util.Scanner;

public class AgeFromJumin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thisYear = (new Date()).getYear()+1900;
        System.out.print("주민번호 : ");
        String jm = sc.next();
        int jumin_year = Integer.parseInt(jm.substring(0,2))+1900;
        char jumin_gender = jm.charAt(7);
        if (jumin_gender == '3' || jumin_gender == '4'){ jumin_year += 100; }
        System.out.println("년생 : "+jumin_year);
        System.out.println("나이 : "+(thisYear-jumin_year+1));
    }
}
