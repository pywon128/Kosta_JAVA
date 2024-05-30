package exam09;

public class Circle extends Shape {
    private double radius;      // 반지름
    private static final double PI = 3.141592;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", area=" + area +
                ", round=" + round +
                '}';
    }

    @Override
    public void calcArea() {        // 면적
        area = PI * radius * radius;
    }

    @Override
    public void calcRound() {       // 둘레
        round = 2*PI*radius;
    }
}
