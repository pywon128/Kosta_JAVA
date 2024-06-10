package exam04;

import javax.swing.*;
import java.awt.*;

public class ImageButton extends JFrame {
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    JButton btn;

    public ImageButton(){
        icon1 = new ImageIcon("C:\\javaTest\\0603\\src\\apple.gif");
        icon2 = new ImageIcon("C:\\javaTest\\0603\\src\\banana.gif");
        icon3 = new ImageIcon("C:\\javaTest\\0603\\src\\grape.gif");

        btn = new JButton(icon1);
        btn.setRolloverIcon(icon2);
        btn.setPressedIcon(icon3);

        setLayout(new FlowLayout());
        add(btn);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButton();
    }
}
