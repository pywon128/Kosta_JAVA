class Rectangle{
    private double width;
    private double length;
    public double getLength()  { return length; }
    public double getWidth() { return width; }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
    public double calcArea(){ return this.width * this.length; }
}
public class RectangleTest {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setWidth(200);
        r.setLength(300);
        System.out.println("가로 : "+ r.getWidth());
        System.out.println("세로 : "+ r.getLength());
        System.out.println("면적 : "+ r.calcArea());
    }
}
