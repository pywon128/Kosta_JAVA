package exam09;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(int x, int y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", round=" + round +
                '}';
    }

    @Override
    public void calcArea() {        // 면적
        area = width*length;
    }

    @Override
    public void calcRound() {       //둘레
        round = (width+length)*2;
    }
}

