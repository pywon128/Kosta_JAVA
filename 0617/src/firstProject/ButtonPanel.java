package firstProject;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel{
    private JButton closeBtn;
    private JButton startBtn;
    private JButton changeMapBtn;

    public ButtonPanel(){
        changeMapBtn = new JButton("맵 변경");
        startBtn = new JButton("게임 시작");
        closeBtn = new JButton("나가기");

        add(changeMapBtn);
        add(startBtn);
        add(closeBtn);

        setLayout(new FlowLayout());

        closeBtn.addActionListener(e -> {
            GameFrame.closeMethod();
        });
    }
}
