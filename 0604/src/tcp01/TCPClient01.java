package tcp01;

import java.io.InputStream;
import java.net.Socket;

public class TCPClient01 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.27",9001);
            InputStream inputStream = socket.getInputStream();
            for (int i = 0; i < 10; i++) {
                int n = inputStream.read();
                System.out.println("서수데 : "+n);
            }
            inputStream.close();
            socket.close();
        }catch (Exception e){
            System.out.println("예외 발생 : "+e.getMessage());
        }
    }
}
