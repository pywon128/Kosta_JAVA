package exam09;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {


        // 2차원 도형 어떤 것이라도 담을 수 있는 배열
        Shape[] shapes = new Shape[1000];
        int menu, x=1, y=5, i=0;
        double width, length, radius;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("도형의 종류 선택 : [1. 사각형, 2. 원, 0. 종료]");
            menu = sc.nextInt();

            if (menu < 0 || menu > 2){ continue; }
            if (menu == 0){ break; }

            switch (menu) {
                case 1:
                    System.out.println("사각형의 가로길이 : ");
                    width = sc.nextInt();
                    System.out.println("사각형의 세로길이 : ");
                    length = sc.nextInt();
                    shapes[i] = new Rectangle(x,y,width,length); break;
                case 2:
                    System.out.println("원의 반지름 : ");
                    radius = sc.nextDouble();
                    shapes[i] = new Circle(x, y, radius); break;
            }   // switch
            i++;    // 배열의 인덱스이자 데이터 개수
        }   // while

        for (int j = 0; j < i; j++) {
            shapes[j].calcArea();
            shapes[j].calcRound();
            System.out.println(shapes[j]);
        }

    }
}
