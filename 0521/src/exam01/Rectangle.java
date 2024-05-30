package exam01;

public class Rectangle extends TwoDimShape{
    private double width;
    private double length;

    // 생성자
    public Rectangle(int x, int y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", area=" + area +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void calcArea() {
        area = width*length;
    }
}
