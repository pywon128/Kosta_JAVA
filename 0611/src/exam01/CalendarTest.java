package exam01;

import java.util.Calendar;

// CalendarTest
public class CalendarTest {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);
        int date = calendar.get(Calendar.DAY_OF_MONTH);

        // 시, 분, 초, 요일에 대한 정보 출력
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String[] arr = {"","일","월","화","수","목","금","토"};
        System.out.println(arr[day]);
    }
}
