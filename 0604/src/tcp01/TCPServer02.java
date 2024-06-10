package tcp01;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer02 {
    public static void main(String[] args) {
        Random r = new Random();
        try{
            ServerSocket server = new ServerSocket(9001);
            System.out.println("통준완");
            while (true){
                Socket socket = server.accept();
                System.out.println("*** 클라이언트가 연결하였습니다 ***");
                OutputStream outputStream = socket.getOutputStream();
                for (int i = 0; i < 10; i++) {
                    outputStream.write(r.nextInt(100)+1);
                    Thread.sleep(200);
                }
                System.out.println("데전완");
                outputStream.close();
                server.close();
            }
        }catch (Exception e){
            System.out.println("예외발생 : "+e.getMessage());
        }
    }
}
