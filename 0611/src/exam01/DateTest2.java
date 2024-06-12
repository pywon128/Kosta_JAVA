package exam01;


import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {
//        String days = '화', '수,]

        // 이번달의 1일의 요일을 확인하는 프로그램
        Date today = new Date();
        int year = today.getYear();
        int month = today.getMonth();

        Date start = new Date(year, month, 1);
        int day = start.getDay();
        System.out.println(day);

    }
}
