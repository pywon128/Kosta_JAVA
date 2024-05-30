package exam03;

import java.util.Random;

public class RandomTest2 {
    public static void main(String[] args) {
        // 1~10 사이의 난수 만들기
        Random r = new Random();

        // 방법1
//        int data1 = r.nextInt(10)+1;
//        System.out.println("data1 = " + data1);

        //방법2
//        int data2 = r.nextInt();
//        if (data2 < 0){
//            data2 = data2*-1;
//        }
//        data2 = (data2%10)+1;
//        System.out.println("data2 = " + data2);

        //방법3
//        int data3 = r.nextInt() >>> 1;  // >>>1 : 무조건 양수로 만들어줌
//        data3 = data3%10 +1;
//        System.out.println("data3 = " + data3);

        //방법4
        long data4 = System.currentTimeMillis()%10+1;
        System.out.println("data4 = " + data4);



    }
}
