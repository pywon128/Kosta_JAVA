package exam01;

public class Shape {
    protected int x;
    protected int y;

    // 생성자
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Shape() {
    }

    // getter&setter
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

    @Override
    public String
    toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
