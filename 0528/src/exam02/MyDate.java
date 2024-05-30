package exam02;

import java.util.StringTokenizer;

public class MyDate {
    StringTokenizer stringTokenizer;
    String year, month, date;
    public MyDate(String strDate) throws IllegalArgumentException{
        stringTokenizer  = new StringTokenizer(strDate,"/");
        year = stringTokenizer.nextToken();
        month = stringTokenizer.nextToken();
        date = stringTokenizer.nextToken();
    }

    public MyDate() {
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "stringTokenizer=" + stringTokenizer +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
