package exam02;

import java.util.Scanner;

public class MyDateTest {
    static String date;
    public static void main(String[] args) {
        MyDate myDate;
//        Scanner sc = new Scanner(System.in);

        while (true){
//            System.out.print("연,월,일을 /로 구분하여 입력 : ");
//            date = sc.next();
//            date = "2024/05/28";
            try {
                if (date == null){
                    throw new IllegalArgumentException("잘못된 값 입니다.");
                }else {
                    myDate = new MyDate(date);
                    System.out.println(myDate);
                }
            } catch (IllegalArgumentException e){
                System.out.println("예외 발생 : "+e.getMessage());
            }
            break;
        }
    }
}