package exam08;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape r1 = new Rectangle(10,10,5.5,7.5);
//        r1.calcArea();
//        r1.calcRound();
//        System.out.println(r1);
//
//        Shape c1 = new Circle(30, 30, 5);
//        c1.calcArea();
//        c1.calcRound();
//        System.out.println(c1);

        // 2차원 도형 어떤 것이라도 담을 수 있는 배열
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10,10,50);
        shapes[1] = new Rectangle(10,200,100,100);
        shapes[2] = new Circle(10,310,25);

        for (Shape shape : shapes){
            shape.calcArea();
            shape.calcRound();
            System.out.println(shape);
        }

    }
}
