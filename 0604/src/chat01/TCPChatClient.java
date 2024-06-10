package chat01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class TCPChatClient extends JFrame {
    JTextArea jta;
    JTextField jtf;
    InputStream inputStream;
    OutputStream outputStream;
    Socket socket;

    public TCPChatClient(){
        //1. 서버와 통신하기 위한 소켓 생성
        try {
            //1. 서버와 통신하기 위한 소켓 생성
            socket = new Socket("172.30.1.27", 9003);
            //2. 생성된 소켓을 통하여 입출력 스트림을 생성
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (Exception e){
            System.out.println("예외처리 : "+e.getMessage());
        }

        jta = new JTextArea();
        jtf = new JTextField(50);
        JScrollPane jsp = new JScrollPane(jta);
        JButton btnSend = new JButton("전송");
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(jtf, BorderLayout.CENTER);
        p.add(btnSend, BorderLayout.EAST);
        add(jsp, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //서버로 부터 수신된 데이터를 계속 받기 위한 쓰레드
        class ClientThread extends Thread{
            @Override
            public void run() {
                byte[] data = new byte[100];
                while (true){
                    try {
                        inputStream.read(data);
                        jta.append(new String(data)+"\n");
//                        jta.append("\n");
                        Arrays.fill(data, (byte) 0);

                    }catch (Exception exception){
                        System.out.println("예외발생 : "+exception.getMessage());
                    }
                }

            }
        }

        ClientThread ct = new ClientThread();
        ct.start();

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 보낼 데이터를 byte 형 데이터로 만듬
                    byte[] data = jtf.getText().getBytes();
                    outputStream.write(data);
                }catch (Exception ex){
                    System.out.println("예외발생 : "+ex.getMessage());
                }
                jtf.setText("");
            }
        });
    }


    public static void main(String[] args) {
        new TCPChatClient();
    }
}
