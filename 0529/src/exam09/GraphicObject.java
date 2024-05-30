package exam09;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// 타겟, 미사일, 플레이어 가 가져야 할 공통적인 속성과 동작을 뽑아 확장
public class GraphicObject {
    // 타겟, 미사일, 플레이어를 나타낼 이미지를 담을 변수
    BufferedImage img = null;
    int x=0, y=0;

    public GraphicObject(String fileName){  //생성자
        try {
            this.img = ImageIO.read(new File(fileName));
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    public void update(){}
    public void draw(Graphics g){
        g.drawImage(img,x,y,null);
    }

    public void keyPressed(KeyEvent event){}
}
