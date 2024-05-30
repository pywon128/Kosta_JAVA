package exam01;
// 주민등록번호를 입력받아 올바른 주민등록번호인지 판별하는 프로그램을 작성

//ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

import java.util.Scanner;

public class CheckJumin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=2;
        int addJumin = 0;

        System.out.print("주민번호 : ");
        String jmNumber = sc.next();
        if (jmNumber.length() != 14 || jmNumber.charAt(6)!='-'){ return; }

        jmNumber = jmNumber.substring(0,6) + jmNumber.substring(7,13);

        for (int i = 0; i < jmNumber.length(); i++) {
            addJumin += (n++)*Integer.parseInt(jmNumber.substring(i,i+1));
            if (n==10){ n=2; }
        }

        addJumin = (11-(addJumin%11));
        System.out.println("마지막자리 : "+ (addJumin >= 10 ? addJumin-10 : addJumin));
    }
}