package exam09;

import java.util.Random;

public class Enermy extends GraphicObject{
    int dx = -10;
    Random r = new Random();
    // target 의 이동 크기

    public Enermy(String fileName) {
        super(fileName);
        x = r.nextInt(2)*500;
        y = 10;
        // target 의 x y 위치를 설정
    }

    @Override
    public void update() { // 동작
        x += dx;
        // target 의 위치는 오른쪽 끝에서 왼쪽으로 -10 씩 이동
        if (x<0) {
            dx = +10;
            // target 이 왼쪽 끝으로 가면 오른쪽으로 +10 만큼 이동
        }
        if (x>450){
            dx = -10;
            // target 이 오른쪽 끝으로 가면 왼쪽으로 -10 만큼 이동
        }
    }
}
