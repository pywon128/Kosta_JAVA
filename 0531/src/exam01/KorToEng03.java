package exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class KorToEng03 extends JFrame {
    JTextArea jta01;
    JTextArea jta02;


    public KorToEng03() {
        jta01= new JTextArea(10, 50);
        jta02= new JTextArea(10, 50);

        JButton btnOK = new JButton("변환");
        JButton btnCancel = new JButton("취소");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setLayout(new GridLayout(1, 2,10,10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JScrollPane jsp01 = new JScrollPane(jta01);
        JScrollPane jsp02 = new JScrollPane(jta02);

        p1.add(jsp01);
        p1.add(jsp02);

        p2.add(btnOK);
        p2.add(btnCancel);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, String> convert = new HashMap<>(){{
                    put("텍스트", "Text");
                    put("영어", "English");
                }};

                String jta01Text = jta01.getText();
                Set<String > keyList = convert.keySet();
                Iterator<String> iter = keyList.iterator();
                while (iter.hasNext()){
                    String kor = iter.next();
                    String eng = convert.get(kor);
                    jta01Text = jta01Text.replace(kor, eng);
                }


                jta02.setText(jta01Text);
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta01.setText("");
                jta02.setText("");
            }
        });

    }


    public static void main(String[] args) {
        new KorToEng03();
    }

}