package exam08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class AddTest extends JFrame{

    JTextField jTF01;
    JTextField jTF02;
    JTextField jTF03;

    public AddTest() {
        jTF01 = new JTextField(10);
        jTF02 = new JTextField(10);
        jTF03 = new JTextField(10);

        JPanel p_center = new JPanel();
        JPanel p_south = new JPanel();

        p_center.setLayout(new GridLayout(3, 2));
        p_south.setLayout(new FlowLayout(FlowLayout.CENTER));

        p_center.add(new JLabel("첫 번째 정수 : "));
        p_center.add(jTF01);
        p_center.add(new JLabel("두 번째 정수 : "));
        p_center.add(jTF02);
        p_center.add(new JLabel("SUM : "));
        p_center.add(jTF03);

        JButton btnAdd = new JButton("Add");
        JButton btnClear = new JButton("Clear");

        p_south.add(btnAdd);
        p_south.add(btnClear);

        setLayout(new BorderLayout());
        add(p_center, BorderLayout.CENTER);
        add(p_south, BorderLayout.SOUTH);

        setSize(400,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num01;
                int num02;
                int sum;
//        System.out.println(jTF01.getText());
                if (!jTF01.getText().isEmpty() && !jTF02.getText().isEmpty()){
                    try{
                        num01 = Integer.parseInt(jTF01.getText());
                        num02 = Integer.parseInt(jTF02.getText());
                        sum = num01 + num02;
                        jTF03.setText(String.valueOf(sum));
                    } catch (Exception exception){
                        jTF03.setText("잘못된 값 입니다.");
                    }
                }else {
                    jTF03.setText("값을 입력하세요");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTF01.setText("");
                jTF02.setText("");
                jTF03.setText("");
            }
        });
    }





    public static void main(String[] args) {
        new AddTest();
    }
}
