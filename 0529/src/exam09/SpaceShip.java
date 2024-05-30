package exam09;

import java.awt.event.KeyEvent;

public class SpaceShip extends GraphicObject {
    public SpaceShip(String fileName){
        super(fileName);
        x = 220;
        y = 350;
        // player 의 초기 위치를 설정
    }

    @Override
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_LEFT) { x -= 10; }
        // 키보드 왼쪽 방향키를 누르면 왼쪽으로 10 만큼 이동
        if (event.getKeyCode() == KeyEvent.VK_RIGHT) { x += 10; }
        // 키보드 오른쪽 방향키를 누르면 오른쪽으로 10 만큼 이동
        if (event.getKeyCode() == KeyEvent.VK_UP) { y -= 10; }
        // 키보드 위쪽 방향키를 누르면 위쪽으로 10 만큼 이동
        if (event.getKeyCode() == KeyEvent.VK_DOWN) { y += 10; }
        // 키보드 아래쪽 방향키를 누르면 아래쪽으로 10 만큼 이동
    }
}
