package exam01;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1000];
        Scanner sc = new Scanner(System.in);
        int menu, x, y, n=0;
        double width, length, height, radius;


        while (true){
            do {
                System.out.println("1.사각형 2.삼각형 3.직육면체 4.원기둥");
                System.out.print("도형의 종류를 선택 : ");
                menu = sc.nextInt();
            } while (menu<0 || menu > 5);
            if (menu==0){ break; }

            System.out.print("도형의 x 위치 : ");
            x = sc.nextInt();
            System.out.print("도형의 x 위치 : ");
            y = sc.nextInt();

            switch(menu){
                case 1:
                    System.out.print("사각형의 가로 : ");
                    width = sc.nextDouble();
                    System.out.print("사각형의 세로 : ");
                    length = sc.nextDouble();
                    shapes[n] = new Rectangle(x, y, width, length); break;
                case 2:
                    System.out.print("삼각형의 밑변 : ");
                    width = sc.nextDouble();
                    System.out.print("삼각형의 높이 : ");
                    height = sc.nextDouble();
                    shapes[n] = new Triangle(x, y, width, height); break;
                case 3:
                    System.out.print("직육면체의 가로 : ");
                    width = sc.nextDouble();
                    System.out.print("직육면체의 세로 : ");
                    length = sc.nextDouble();
                    System.out.print("직육면체의 높이 : ");
                    height = sc.nextDouble();
                    shapes[n] = new Cube(x, y, width, length, height); break;
                case 4:
                    System.out.print("원기둥의 반지름 : ");
                    radius = sc.nextDouble();
                    System.out.print("원기둥의 높이 : ");
                    height = sc.nextDouble();
                    shapes[n] = new Cylinder(x, y, radius, height); break;
            } // end switch
            n++;

        } // end while

        for (int i = 0; i < n; i++) {
            Shape s = shapes[i];
            if (s instanceof TwoDimShape){
                ((TwoDimShape) s).calcArea();
            }else {
                ((ThreeDimShape) s).calcVolume();
            }
            System.out.println(s);
        }
    }
}
