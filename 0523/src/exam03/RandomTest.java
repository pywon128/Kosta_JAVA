package exam03;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r= new Random();

        int data1 = r.nextInt(); // nextInt : int의 범위내에서 무작위로 뽑아줌
        int data2 = r.nextInt(10);  // 0~10-1 사이에서 무작위로 뽑아줌
        System.out.println(data2);

        int data3 = r.nextInt(10)+1;
        System.out.println(data3);

    }
}
