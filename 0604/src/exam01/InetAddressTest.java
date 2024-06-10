package exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress addr = InetAddress.getByName("www.naver.com");
//        System.out.println(addr.toString());
        InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
        for (InetAddress addr : arr){
            System.out.println(addr.toString());
        }
    }
}
