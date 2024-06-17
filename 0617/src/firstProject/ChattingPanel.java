package firstProject;

import javax.swing.*;
import java.awt.*;

public class  ChattingPanel extends JPanel {
    JTextArea textArea;
    JTextField textInput;
    JButton sendBtn;
    JScrollPane jScrollPane;

    public ChattingPanel(){
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new ButtonPanel());
//        topPanel.setBorder(new LineBorder(Color.BLACK));
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(jScrollPane = new JScrollPane(textArea = new JTextArea()));
//        centerPanel.setBorder(new LineBorder(Color.BLACK));

        add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(textInput = new JTextField(23));
        bottomPanel.add(sendBtn = new JButton("전송"));
        add(bottomPanel, BorderLayout.SOUTH);

        setLayout(new GridLayout(3,1));

    }
}
