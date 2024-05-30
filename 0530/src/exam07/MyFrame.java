package exam07;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JButton button01;
    JButton button02;

    public MyFrame(){
        button01 = new JButton("남자");
        button02 = new JButton("여자");
        add(button01);
        add(button02);

        //배치관리자를 FlowLayout으로 설정
        setLayout(new FlowLayout());

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }


    public static void main(String[] args) {
        new MyFrame();

    }
}
