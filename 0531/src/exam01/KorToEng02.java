package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KorToEng02 extends JFrame {
    JTextArea jta01;
    JTextArea jta02;

    static String[] suffix = {"은", "는", "이", "가", "로"};

    // 조사를 떼고 반환하는 메서드
    public static String getRemoveSuffix(String kor){
        // 영어로
        for (String s : suffix){
            if (kor.endsWith(s)){
                kor = kor.substring(0,kor.length()-1);
                break;
            }
        }
        return kor;
    }


    public KorToEng02() {
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
                String kor;
                StringTokenizer jta01GetText = new StringTokenizer(jta01Text);

                while (jta01GetText.hasMoreTokens()){
                    kor = jta01GetText.nextToken();
                    System.out.println("kor = " + kor);
                    kor = getRemoveSuffix(kor);
                    System.out.println("kor = " + kor);
                    String eng = convert.get(kor);
                    System.out.println("eng = " + eng);
                    if (eng != null){
                        System.out.println("kor = " + kor);
                        jta01Text = jta01Text.replace(kor, eng);
                    }

//                    System.out.println(tokenText);
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
        new KorToEng02();
    }

}