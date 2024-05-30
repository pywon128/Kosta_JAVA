package exam01;

public class Triangle extends TwoDimShape{
    private double width;
    private double length;

    // 생성자
    public Triangle(int x, int y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }
    public Triangle() {
    }

    // getter & setter
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
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", area=" + area +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void calcArea() {
        area = (width*length)/2;
    }
}
