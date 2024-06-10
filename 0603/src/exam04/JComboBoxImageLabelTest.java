package exam04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxImageLabelTest extends JFrame {
    JComboBox<String> comboBox;
    JLabel iconLabel;
    ImageIcon icon;

    public JComboBoxImageLabelTest(){
        setLayout(new BorderLayout());
//        icon = new ImageIcon();
        comboBox = new JComboBox<>();
        comboBox.addItem("apple");
        comboBox.addItem("banana");
        comboBox.addItem("grape");
        comboBox.addItem("peach");
        comboBox.addItem("persimmon");
        iconLabel = new JLabel("라벨입니다만");

        add(comboBox, BorderLayout.NORTH);
        add(iconLabel, BorderLayout.CENTER);

        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(comboBox.getSelectedItem());
                icon = new ImageIcon("C:\\javaTest\\0603\\src\\"+comboBox.getSelectedItem()+".gif");
                iconLabel.setIcon(icon);
            }
        });
    }

    public static void main(String[] args) {
        new JComboBoxImageLabelTest();
    }
}
