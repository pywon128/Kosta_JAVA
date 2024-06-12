package exam01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        String[] arr = {"일","월","화","수","목","금","토"};

        GregorianCalendar today = new GregorianCalendar();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH)+1;
        int date = today.get(Calendar.DAY_OF_MONTH);
        int day = today.get(Calendar.DAY_OF_WEEK);
        int hours = today.get(Calendar.HOUR);
        int minutes = today.get(Calendar.MINUTE);
        int seconds = today.get(Calendar.SECOND);

        System.out.println(year+"년 "+month+"월 "+date+"일 "+
                arr[day-1]+"요일 "+ hours+":"+minutes+":"+seconds);

        if (today.isLeapYear(year)){
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이아닙니다.");
        }

    }
}
