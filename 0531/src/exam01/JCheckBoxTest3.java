package exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JCheckBoxTest3 extends JFrame {
    JCheckBox box01;
    JCheckBox box02;
    JCheckBox box03;
    JCheckBox box04;
    JLabel label_box01;
    JLabel label_box02;
    JLabel label_box03;
    JLabel label_box04;
    JLabel label_sum;
    JButton repair;

    int sum;

    public JCheckBoxTest3() {
        setLayout(new FlowLayout());
        box01 = new JCheckBox("엔진 오일 교환");
        label_box01 = new JLabel("45000원");
        add(box01);
        add(label_box01);
        box02 = new JCheckBox("자동 변속기 오일 교환");
        label_box02 = new JLabel("80000원");
        add(box02);
        add(label_box02);
        box03 = new JCheckBox("에어콘 필터 교환");
        label_box03 = new JLabel("30000원");
        add(box03);
        add(label_box03);
        box04 = new JCheckBox("타이어 교환");
        label_box04 = new JLabel("10000원");
        add(box04);
        add(label_box04);

        repair = new JButton("수리하기");
        add(repair);

        label_sum = new JLabel("선택한 정비 금액 : "+sum);
        add(label_sum);

        setSize(240,300);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        repair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_sum.setText(String.valueOf(sum)+" 원");
            }
        });

        box01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc(box01.isSelected(), 45000);

            }
        });
        box02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc(box02.isSelected(), 80000);
            }
        });
        box03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc(box03.isSelected(), 30000);
            }
        });
        box04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc(box04.isSelected(), 100000);
            }
        });
    }

    public void calc(boolean isRepair, int price){
        if (isRepair){
            sum += price;
        }else {
            sum -= price;
        }
    }

    public static void main(String[] args) {
        new JCheckBoxTest3();
    }
}
