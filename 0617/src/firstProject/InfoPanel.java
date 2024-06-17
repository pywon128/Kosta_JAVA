package firstProject;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel{
    JLabel p1_id;
    JLabel p1_correct;
    JLabel p1_wrong;

    JLabel p2_id;
    JLabel p2_correct;
    JLabel p2_wrong;

    JLabel question_count;

    public InfoPanel(){
        JPanel leftPanel = new JPanel(new GridLayout(3,2));
        leftPanel.add(new JLabel("아이디: "));
        leftPanel.add(p1_id = new JLabel("아이디1"));
        leftPanel.add(new JLabel("정답: "));
        leftPanel.add(p1_correct = new JLabel("정답 개수"));
        leftPanel.add(new JLabel("오답: "));
        leftPanel.add(p1_wrong = new JLabel("오답 개수"));

        JPanel centerPanel = new JPanel(new GridLayout(2,3));
        centerPanel.add(new JLabel(""));
        centerPanel.add(new JLabel("남은 문제"));
        centerPanel.add(new JLabel(""));
        centerPanel.add(new JLabel(""));
        centerPanel.add(question_count = new JLabel("       7"));
        centerPanel.add(new JLabel(""));

        JPanel rightPanel = new JPanel(new GridLayout(3,2));
        rightPanel.add(new JLabel("아이디: "));
        rightPanel.add(p2_id = new JLabel("아이디2"));
        rightPanel.add(new JLabel("정답: "));
        rightPanel.add(p2_correct = new JLabel("정답 개수"));
        rightPanel.add(new JLabel("오답: "));
        rightPanel.add(p2_wrong = new JLabel("오답 개수"));

        add(leftPanel, BorderLayout.WEST);
        add(centerPanel);
        add(rightPanel);
        setLayout(new FlowLayout());
    }
}
