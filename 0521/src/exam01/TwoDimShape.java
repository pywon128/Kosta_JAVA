package exam01;

public abstract class TwoDimShape extends Shape{
    protected double area;

    // 생성자
    public TwoDimShape(int x, int y) {
        super(x, y);
    }
    public TwoDimShape() {
    }

    // getter
    public double getArea() {
        return area;
    }

    // abstract method
    public abstract void calcArea();

}
