package firstProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    private ImageIcon imageIcon;
    private List<Point> points = new ArrayList<>();
    private Point clickPoint;

    public ImagePanel(String imageURL) {
        clickPoint = new Point();

        imageIcon = new ImageIcon(imageURL);
        ImageLabel imageLabel = new ImageLabel(imageIcon);

        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);

        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getPoint());
                clickPoint = e.getPoint();
                repaint();
            }
        });
    }

    private class ImageLabel extends JLabel {
        public ImageLabel(ImageIcon imageIcon) {
            super(imageIcon);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 빨간 동그라미를 그림
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.RED);
            g2.setStroke(new BasicStroke(3)); // 테두리 두께 설정

            if (CheckAnswer.check(clickPoint)){
                points.add(clickPoint);
                for (Point point : points) {
                    g2.drawOval(point.x - 15, point.y - 15, 30, 30);
                }
            }
        }
    }

    public Point getClickPoint() {
        return clickPoint;
    }
}