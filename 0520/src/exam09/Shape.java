package exam09;

public class Shape {
    protected int x;
    protected int y;
    protected double area;
    protected double round;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getRound() {
        return round;
    }
    public void setRound(double round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", area=" + area +
                ", round=" + round +
                '}';
    }

    public void calcArea(){

    }
    public void calcRound(){}

}
