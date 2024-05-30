package exam01;

public class Cylinder extends ThreeDimShape{
    public static final double PI = 3.141592;
    private double radius;
    private double height;

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y);
        this.radius = radius;
        this.height = height;
    }
    public Cylinder() {
    }

    // getter & setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "x=" + x +
                ", y=" + y +
                ", volume=" + volume +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public void calcVolume() {
        volume = PI * radius*radius*height;
    }

    @Override
    public void getSurfaceArea() {

    }
}
