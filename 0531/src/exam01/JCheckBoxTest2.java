package exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JCheckBoxTest2 extends JFrame {
    JCheckBox box01;
    JCheckBox box02;
    JCheckBox box03;
    JCheckBox box04;
    JCheckBox box05;
    JLabel label_sel;
    ArrayList<String> fruits = new ArrayList<>();

//    public void printF(boolean apple, boolean grape){
//        if (apple && grape){ label_sel.setText("사과, 포도를 선택하였습니다."); }
//        else if (apple){ label_sel.setText("사과를 선택하였습니다."); }
//        else if (grape) { label_sel.setText("포도를 선택하였습니다."); }
//        else { label_sel.setText("아무것도 선택하지 않았습니다."); }
//    }

    public void printF(ArrayList<String> fruits){
        String result = "";
        if (!fruits.isEmpty()){
            for (String s : fruits){
                result += s+" ";
            }
            result += "를 선택 하였습니다.";
        }else {
            result = "과일을 선택하세요";
        }

        label_sel.setText(result);
    }

    public void isTrue(boolean fruit, String name){
//        System.out.println(fruit+", "+name);
        if (fruit){
            fruits.add(name);
        } else {
            fruits.remove(name);
        }
        printF(fruits);
    }

    public JCheckBoxTest2() {

        setLayout(new FlowLayout());
        box01 = new JCheckBox("사과");
        box02 = new JCheckBox("포도");
        box03 = new JCheckBox("수박");
        box04 = new JCheckBox("바나나");
        box05 = new JCheckBox("오렌지");

        add(box01);
        add(box02);
        add(box03);
        add(box04);
        add(box05);

        label_sel = new JLabel("선택하세요");
        add(label_sel);

        setSize(350,300);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        box01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(box01.getText());
                isTrue(box01.isSelected(), box01.getText());
            }
        });
        box02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTrue(box02.isSelected(), box02.getText());
            }
        });
        box03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTrue(box03.isSelected(), box03.getText());
            }
        });
        box04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTrue(box04.isSelected(), box04.getText());
            }
        });
        box05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTrue(box05.isSelected(), box05.getText());
            }
        });
    }

    public static void main(String[] args) {
        new JCheckBoxTest2();
    }
}
