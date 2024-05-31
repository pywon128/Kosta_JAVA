package exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuess extends JFrame {
    JTextField textField_input;
    JLabel label_result;
    JLabel label_count;
    JLabel label_title;

    Random r;
    int user;
    int com;
    int count;

    public NumberGuess(){
        r = new Random();
        com = r.nextInt(100)+1;

        setTitle("숫자게임");
        setLayout(new FlowLayout());

        textField_input = new JTextField(15);

        label_title = new JLabel("숫자를 추측하시오.");
        add(label_title);
        label_title.setForeground(Color.MAGENTA);

        add(textField_input);

        label_result = new JLabel("여기에 결과가 나옵니다.");
        add(label_result);
//        label_result.setOpaque(true); // 배경 불투명하게
        label_result.setForeground(Color.MAGENTA);

        JButton btnOk = new JButton("다시 한번");
        JButton btnExit = new JButton("종료");
        add(btnOk);
        add(btnExit);
        btnOk.setBackground(new Color(0,255,0));
        btnExit.setBackground(new Color(0,255,0));

        label_count = new JLabel("횟수 : "+count);
        add(label_count);
        label_count.setForeground(Color.MAGENTA);

        getContentPane().setBackground(Color.BLACK);
        setSize(200,170);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_count.setText("시도 횟수 : "+(++count));
                textField_input.setBackground(Color.WHITE);

                user = Integer.parseInt(textField_input.getText());
//                System.out.println("com = " + com);
                if (user == com){
                    label_result.setForeground(new Color(217,142,4));
                    textField_input.setBackground(new Color(217,142,4));
                    com = r.nextInt(100)+1;
                    count = 0;

                    label_result.setText("             정답입니다!             ");
                }else if (user > com){
                    label_result.setText("         너무 높아아요         ");
                    label_result.setForeground(new Color(191,4,38));
                }else {
                    label_result.setText("          너무 낮아아요         ");
                    label_result.setForeground(new Color(3,57,166));
                }
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new NumberGuess();
    }
}
