package exam01;

public class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 10, 100, 100);
        s = new Cube(100, 100, 30, 30, 50);
        if (s instanceof TwoDimShape){
            System.out.println("2차원도형 입니다.");
        }else {
            System.out.println("3차원도형 입니다.");
        }



    }
}
