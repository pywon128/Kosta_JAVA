package exam09;

import java.awt.event.KeyEvent;

public class Missile extends GraphicObject{
    boolean launched = false;
    public Missile(String fileName) {
        super(fileName);
        y = -200;   // 미사일 처음 위치를 화면에 안보이게 함
    }

    @Override
    public void update() {
        if (launched) {y -= 10;}
        if (y < -100) {launched = false;}
        // 미사일의 위치가 화면에서 벗어나면(-100 보다 작아지면) 미사일이 움직이지 않도록함
    }

    public void keyPressed(KeyEvent event, int x, int y) {
        // 키보드가 눌러지면 눌러진 키 이벤트 정보와 플레이어의 위치 x,y 를 가지고 이 메서드를 호출
        /*if (event.getKeyCode() == KeyEvent.VK_SPACE){
            launched = true;
            // 미사일을 발사 시키기 위해 launced에 true를 저장

            // 미사일을 플레이어의 위치에서 부터 발사시키기 위하여 미사일의 x,y 를
            // 매개변수로 전달받은 플레이어의 위치 x,y 로 설정
            this.x = x;
            this.y = y;
        }*/
        launched = true;
        this.x = x;
        this.y = y;
    }
}
