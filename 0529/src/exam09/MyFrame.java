package exam09;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame(){
        setBackground(Color.BLACK);
        panel = new MyPanel();
        add(panel);
        setSize(500,500);
        setVisible(true);

        // 프레임을 닫으면 프로그램을 종료하도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

}
