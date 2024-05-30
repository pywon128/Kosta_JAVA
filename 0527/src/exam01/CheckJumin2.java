package exam01;
// 주민등록번호를 입력받아 올바른 주민등록번호인지 판별하는 프로그램을 작성

//ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

import java.util.Scanner;

public class CheckJumin2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=2;
        int addJumin = 0;

        System.out.print("주민번호 : ");
        String jmNumber = sc.next();

//        String regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
//        String regex = "[0-9]{6}-[0-9]{7}";
        String regex = "\\d{6}-\\d{7}";

        if (!jmNumber.matches(regex)){
            System.out.println("올바른형식이 아닙니다.");
        }else {
            System.out.println("올바른형식입니다.");
        }

    }
}