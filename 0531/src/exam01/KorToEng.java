package exam01;

import javax.swing.*;
import java.awt.*;


public class KorToEng extends JFrame {
    JTextArea jTextArea01;
    JTextArea jTextArea02;

    public KorToEng(){
        jTextArea01 = new JTextArea(10, 50);
        jTextArea01 = new JTextArea(10, 50);

        JButton buttonOk = new JButton("변환");
        JButton buttonCancel = new JButton("취소");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

//        p1.setLayout(new GridLayout(1, 2,10,10));
//        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
//
//        JScrollPane jsp01 = new JScrollPane(jTextArea01);
//        JScrollPane jsp02 = new JScrollPane(jTextArea02);
        p1.setLayout(new GridLayout(1, 2,10,10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JScrollPane jsp01 = new JScrollPane(jTextArea01);
        JScrollPane jsp02 = new JScrollPane(jTextArea02);

        p1.add(jsp01);
        p1.add(jsp02);

        p2.add(buttonOk);
        p2.add(buttonCancel);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new KorToEng();

    }
}
