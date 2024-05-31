package exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxTest extends JFrame {
    JCheckBox box01;
    JCheckBox box02;


    public JCheckBoxTest() {

        setLayout(new FlowLayout());
        box01 = new JCheckBox("사과");
        box02 = new JCheckBox("포도");

        add(box01);
        add(box02);

        setSize(400,300);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        box01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (box01.isSelected()){
                    System.out.println("사과를 선택");
                } else {
                    System.out.println("사과 선택 해제");
                }

            }
        });
        box02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (box02.isSelected()){
                    System.out.println("포도를 선택");
                } else {
                    System.out.println("포도 선택 해제");
                }
            }
        });
    }

    public static void main(String[] args) {
        new JCheckBoxTest();
    }
}
