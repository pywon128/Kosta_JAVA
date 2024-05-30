package exam03;

// 난수연습
/*
    우리반 사람들 중에서 무작위로 한명을 뽑아서 그 사람 이름을 출력하는 프로그램
 */

import java.util.Random;

public class RandomName {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();

        String[] names = {"변시우", "임유나", "홍석영", "조영흔", "유요한", "이동준", "박성빈",
                "박준수", "김예은", "이재원", "장동건", "최모래", "최가은", "박규희",
                "유현진", "공희상", "강동균"};

        String name ="";
        for (int i = 0; i < 100; i++) {
            name = names[i%names.length];
            System.out.print(name);
            Thread.sleep(100);
            System.out.print("\b\b\b");
        }

        System.out.println("------------------------------------");
        System.out.println("*** 당첨자 ***");
        System.out.println(names[r.nextInt(names.length)]);

    }
}
