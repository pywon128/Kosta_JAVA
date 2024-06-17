package firstProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    ImageIcon imageIcon;
    JLabel imageLabel;

    private List<Point> points = new ArrayList<>();

    public ImagePanel(String imageURL){

        imageIcon = new ImageIcon(imageURL);
        imageLabel = new JLabel(imageIcon);

        setLayout(new FlowLayout());
        add(imageLabel);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getPoint());
                points.add(e.getPoint());
                repaint();
            }
        });

//        ImageIcon leftImage = new ImageIcon(
//                "C:\\javaTest\\0617\\src\\firstProject\\image\\1_LEFT.png");
//        ImageIcon rightImage = new ImageIcon(
//                "C:\\javaTest\\0617\\src\\firstProject\\image\\1_RIGHT.png");
//        JLabel leftLabel = new JLabel(leftImage);
//        JLabel rightLabel = new JLabel(rightImage);
//        add(leftLabel);
//        add(rightLabel);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

//        g.drawImage(leftImage, 0, 0, this);
//        g.drawImage(rightImage, leftImage.getWidth(this), 0, this);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(3)); // 테두리 두께 설정
        for (Point point : points) {
            g2.drawOval(point.x - 15, point.y - 15, 30, 30);
        }
    }
}
