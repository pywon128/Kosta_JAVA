package exam01;

public abstract class ThreeDimShape extends Shape{
    protected double volume;

    public ThreeDimShape(int x, int y) {
        super(x, y);
    }
    public ThreeDimShape() {
    }

    // getter
    public double getVolume() {
        return volume;
    }

    public abstract void calcVolume();
    public abstract void getSurfaceArea();
}
