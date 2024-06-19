package firstProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class ImagePanel extends JPanel {
    private ImageIcon imageIcon;

    private List<Point> points;
    private Point clickPoint;

    private Color color;

    private CheckAnswer checkAnswer;

    private int hit;
    private int miss;

    public ImagePanel(String imageURL, Color color) {
        clickPoint = new Point(-100, -100);
        this.color = new Color(color.getRGB());
        checkAnswer = new CheckAnswer();
        points = new ArrayList<>();

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
            System.out.println(points);

            if (clickPoint.x >= 0){
                points.add(clickPoint); // 클릭한 위치

                // 빨간 동그라미를 그림
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                g2.setStroke(new BasicStroke(3)); // 테두리 두께 설정

                if (!checkAnswer.check(clickPoint) && clickPoint.x != -100){    // 틀렸을 때
                    miss ++;
//                g2.drawRect(points.getLast().x, points.getLast().y, 5, 5);
                    g2.drawLine(points.getLast().x - 15, points.getLast().y - 15,
                            points.getLast().x + 15, points.getLast().y + 15);
                    g2.drawLine(points.getLast().x - 15, points.getLast().y + 15,
                            points.getLast().x + 15, points.getLast().y - 15);
                    points.remove(points.getLast());
                }else { hit++; }
                for (Point point : points) {
                    System.out.println("그리기");
                    g2.drawOval(point.x - 15, point.y - 15, 30, 30);
                }
            }
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Point getClickPoint() {
        return clickPoint;
    }
    public int getHit() {
        return hit;
    }
    public int getMiss() {
        return miss;
    }
}