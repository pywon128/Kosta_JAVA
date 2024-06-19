package firstProject;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GamePanel extends JPanel {
    String leftImageURL;
    String rightImageURL;

    public GamePanel(){
        leftImageURL = "C:\\javaTest\\0617\\src\\firstProject\\image\\1_LEFT.png";
        rightImageURL = "C:\\javaTest\\0617\\src\\firstProject\\image\\1_RIGHT.png";

        JPanel imagesPanel = new JPanel();
        JPanel leftImagePanel = new ImagePanel(leftImageURL, Color.RED);
        JPanel rightImagePanel = new ImagePanel(rightImageURL, Color.BLUE);

        imagesPanel.add(leftImagePanel, BorderLayout.CENTER);
        imagesPanel.add(rightImagePanel, BorderLayout.CENTER);
        imagesPanel.setLayout(new GridLayout(1,2));

//        imagesPanel.add(new ImagePanel(), BorderLayout.CENTER);
        imagesPanel.setBorder(new LineBorder(Color.BLACK));

        add(imagesPanel, BorderLayout.CENTER);
        add(new InfoPanel(), BorderLayout.SOUTH);

//        while (!CheckAnswer.answer.isEmpty()){
//            System.out.println("while");
//        }
    }
}
