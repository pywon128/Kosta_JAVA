package chat03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

class ServerThread extends Thread{
//    Socket socket;
    InputStream inputStream;
    OutputStream outputStream;
    //클라이언트로 부터 수신된 데이터를 받기 위한 배열을 만듦
    byte[] data = new byte[100];

    public ServerThread(Socket socket){
//        this.socket = socket;
        try {
            // 연결된 클라이언트와 데이터를 주고받기 위한 입출력 스트림을 생성
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();

        } catch (Exception ex){
            System.out.println("예외처리 : "+ex.getMessage());
        }
    }

    //나와 연결된 클라이언트에게 메세지를 보내는 메서드
    public void send(byte[] arr) throws IOException {
        outputStream.write(arr);
    }

    //연결되어진 모든 클라이언트들에게 메세지를 방송하는 메서드
    public void sendAll(byte[] arr) throws IOException {
        for (ServerThread st : TCPChatServer.list){
            st.send(arr);
        }
    }



    @Override
    public void run() {
        try {
            //연결된 클라이언트와 계속 통신한다.
            while (true){
                inputStream.read(data);
                outputStream.write(data);
                sendAll(data);

                String msg = new String(data);
                System.out.println("수신된 데이터 ==> "+msg);
                Arrays.fill(data, (byte) 0);
            }
        } catch (Exception e){
            System.out.println("예외처리 : "+e.getMessage());
        }
    }
}

public class TCPChatServer {
    public static ArrayList<ServerThread> list;
    public static void main(String[] args) {
        list = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(9003);
            //무한대기 상태로 클라이언트의 접속을 기다린다
            while (true){
                // 클라이언트 접속을 수락
                Socket socket = serverSocket.accept();

                //연결한 클라이언트를 상대하여 계속 통신할 쓰레드를 생성한다.
                ServerThread st = new ServerThread(socket);
                // 쓰레드에서 가동
                st.start();
                list.add(st);
            }
        }catch (Exception e){
            System.out.println("예외 발생 : "+e.getMessage());
        }
    }
}
