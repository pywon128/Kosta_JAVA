package chat01;

import javax.naming.ldap.SortKey;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPChatServer {



    public static void main(String[] args) {
        //클라이언트로 부터 수신된 데이터를 받기 위한 배열을 만듦
        byte[] data = new byte[100];
        try {
            ServerSocket serverSocket = new ServerSocket(9003);

            //무한대기 상태로 클라이언트의 접속을 기다린다
            while (true){
                // 클라이언트 접속을 수락
                Socket socket = serverSocket.accept();

                // 연결된 클라이언트와 데이터를 주고받기 위한 입출력 스트림을 생성
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                //연결된 클라이언트와 계속 통신한다.
                while (true){
                    inputStream.read(data);
                    outputStream.write(data);
                    String msg = new String(data);
                    System.out.println("수신된 데이터 ==> "+msg);
                    Arrays.fill(data, (byte) 0);
                }

            }
        }catch (Exception e){
            System.out.println("예외 발생 : "+e.getMessage());
        }
    }
}
