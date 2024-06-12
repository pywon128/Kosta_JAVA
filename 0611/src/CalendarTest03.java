import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest03 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);

        GregorianCalendar start = new GregorianCalendar(year, month, 1);
        int day = start.get(Calendar.DAY_OF_WEEK);
//        System.out.println(day);

        int last = start.getActualMaximum(Calendar.DAY_OF_MONTH);
        // 그달의 마지막 날

        System.out.printf("\t*** %d년 %d월 ***\n",year,month+1);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("===========================");
        for (int i = 0; i < day-1; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= last; i++) {
            System.out.print(i+"\t");
            if ((i+day-1) % 7 == 0){
                System.out.println();
            }
        }
    }
}
