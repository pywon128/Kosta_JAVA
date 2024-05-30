package exam04;

import java.util.Date;

public class HelloTest{
    public static void main(String[] args) {
        Date d;
        while (true){
           d = new Date();
            try{
                System.out.println((d.getYear()+1900)+"년 "+(d.getMonth()+1)+"월 "+d.getDate()+"일");
                System.out.println(d.getHours()+"시"+d.getMinutes()+"분"+d.getSeconds()+"초"+" 안녕하세요");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
