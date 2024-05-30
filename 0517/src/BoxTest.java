class Box{
    private double width;
    private double length;
    private double height;

    public Box(){
        width = 5.0;
        length = 5.0;
        height = 5.0;
    }

    public Box(double a, double b, double c){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void calcVolume(){
        System.out.println(width*length*height);
    }
}

public class BoxTest {
    public static void main(String[] args){
        Box b = new Box();
        b.calcVolume();
    }
}
