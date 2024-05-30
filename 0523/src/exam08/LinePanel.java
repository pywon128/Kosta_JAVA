package exam08;

import exam07.GraphicInfo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LinePanel extends Panel implements MouseListener {

    int x1, y1, x2, y2;

    int width, lenght;

    GraphicInfo g = new GraphicInfo();

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        System.out.println("마우스 눌러짐");

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        System.out.println("마우스 때어짐");
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
//
        lenght = y2-y1 >>>1;

        g.drawRect(x1,y1, width, lenght);
    }


    public LinePanel() {
        addMouseListener(this);
    }

}
