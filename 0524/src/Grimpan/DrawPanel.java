package Grimpan;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawPanel extends Panel implements MouseListener {

    public Color drawColor;
    int x1, y1, x2, y2;

    int width, height;
    int drawType; //0:선, 1:사각형 2:원
    int color;  // 빨강, 파랑, 초록

    public void setColor(int color){
        this.color = color;
    }
    public void setDrawType(int drawType) {
        this.drawType = drawType;
    }

    ArrayList<GraphicInfo> graphicInfos = new ArrayList<GraphicInfo>();


    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
//        System.out.println("마우스 눌러짐");

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
//        graphicInfos.add(new GraphicInfo(x1,y1,x2,y2));
//        System.out.println("마우스 때어짐");
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

        graphicInfos.add(new GraphicInfo(x1,y1,x2,y2,drawType,drawColor));
        int x, y, width, height;

        for (GraphicInfo graphicInfo : graphicInfos){
            x = Math.min(graphicInfo.getX1(), graphicInfo.getX2());
            y = Math.min(graphicInfo.getY1(), graphicInfo.getY2());
            width = Math.abs(graphicInfo.getX1()-graphicInfo.getX2());
            height = Math.abs(graphicInfo.getY1()-graphicInfo.getY2());

            g.setColor(graphicInfo.drawColor);

            switch (graphicInfo.getDrawType()){
                case 0: // 선
                    g.drawLine(graphicInfo.getX1(), graphicInfo.getY1(),
                            graphicInfo.getX2(), graphicInfo.getY2()); break;
                case 1: // 사각형
                    g.drawRect(x,y,width,height); break;

                case 2: // 원
                    g.drawOval(x,y,width,height); break;

            }
        }


//        int x = x1;
//        int y = y1;
//        int width = x2-x1;
//        int height = y2-y1;
//
//        if (x1>x2){
//            x = x2;
//            width = x1-x2;
//        }
//        if (y1>y2){
//            y = y2;
//            height = y1-y2;
//        }
//        g.drawRect(x,y,width,height);
        // 사각형

    }


    public DrawPanel() {
        addMouseListener(this);
    }

}
