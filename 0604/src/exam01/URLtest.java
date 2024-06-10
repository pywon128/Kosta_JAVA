package exam01;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class URLtest {
    public static void main(String[] args) {
        byte[] data = new byte[200];

        try {
            URL url = new URL("https://www.hanbit.co.kr/");
            InputStream is = url.openStream();
            String str = "";
            while (is.read(data) != -1){
                str += new String(data);
                Arrays.fill(data, (byte) 0);
            }
            System.out.println(str);
            is.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
