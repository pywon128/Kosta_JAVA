package exam07;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FlowLayoutTest extends JFrame{

    public FlowLayoutTest(ArrayList<JButton> buttons){

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        for (JButton jButton : buttons){
            add(jButton);
        }

    }


    public static void main(String[] args) {
        ArrayList<JButton> buttons = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            buttons.add(new JButton("버튼"+i));
        }

        new FlowLayoutTest(buttons);

    }
}
