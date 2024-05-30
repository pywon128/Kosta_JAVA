package Grimpan02;

import java.awt.*;
import java.io.Serializable;

// Serializable - 직렬화
// 스트림은 순서가 있는 자료의 흐름으로 Serializable 인터페이스를 통해 순서를 정해줌
public class GraphicInfo implements Serializable {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int drawType;
    Color drawColor;


    public GraphicInfo(int x1, int y1, int x2, int y2, int drawType, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.drawType = drawType;
        drawColor = color;
    }

    public GraphicInfo() {
    }


    public int getDrawType() {
        return drawType;
    }

    public void setDrawType(int drawType) {
        this.drawType = drawType;
    }

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
}
