package exam09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// JPanel 을 상속 받고 KeyListener 인터페이스를 구현하는 MyPanel 클래스를 만듦
// JPanel : 그래픽 이미지를 표현하기 위해
// KeyListener : 키보드 조작을 위해
public class MyPanel extends JPanel implements KeyListener {
    // 이미지파일을 참조하기 위한 변수를 선언
    Enermy enermy;
    SpaceShip spaceShip;
    Missile missile;
    Boom b;

    public MyPanel(){
        super();
        this.addKeyListener(this);
        this.requestFocus();
        setFocusable(true);

        enermy = new Enermy("C:\\javaTest\\0529\\src\\exam09\\image\\ufo.png");
        spaceShip = new SpaceShip("C:\\javaTest\\0529\\src\\exam09\\image\\player.png");
        missile = new Missile("C:\\javaTest\\0529\\src\\exam09\\image\\missile.png");
        b = new Boom("C:\\javaTest\\0529\\src\\exam09\\image\\bomb.png");
        // Enermy, SpaceShip, Missole 각각의 이미지 경로를 매개변수로 주고 객체 생성

        // 적 , 미사일, 플레이어가 제 각각 동시다발적으로 움직이게 하기 위하여 쓰레드 클래스를 만듦
        // 이것은 다른곳에서는 쓸일이 없기 때문에
        // 이 클래스(MyPanel) 안에 Inner 클래스로 만듦
        class MyThread extends Thread{
            @Override
            public void run() {
                while (true){
                    // 쓰레드가 해야할 일 즉, 적, 미사일, 플레이어가 동시 다발적으로 움직이는 코드는
                    // run을 오버라이딩 하여 써줌
                    enermy.update();
//                    spaceShip.update();
                    missile.update();
                    repaint();
                    try{ Thread.sleep(50); }
                    catch (InterruptedException e) {throw new RuntimeException(e); }
//                    System.out.println("enermy.x : "+enermy.x);
//                    System.out.println("enermy.y : " +enermy.y);
//                    System.out.println("missile.y = " + missile.y);
//                    System.out.println("missile.x = " + missile.x);
//                    System.out.println("missile.y+enermy.x = "+(missile.y+enermy.x));

                    if (((missile.x > (enermy.x-45))&&(missile.x<(enermy.x+45))) && (missile.y+10 == enermy.y)){
//                        System.out.println("enermy.x : "+enermy.x);
//                        System.out.println("missile.y : " +missile.y);
//                        System.out.println(b.getX()+","+b.getY());
                        System.out.println("격추!");
                        missile.y = -100;
                        b.setXY(enermy.x, enermy.y);
//                        enermy = new Enermy("C:\\javaTest\\0529\\src\\exam09\\image\\ufo.png");
                        enermy.dx = 0;
                    }
                }
            }
        }
        Thread t = new MyThread();
        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        // repaint 를 하면 호출됨
        super.paintComponent(g);
        // 이미지 중복을 삭제하기 위해 super.paintComponent
        enermy.draw(g);
        spaceShip.draw(g);
        missile.draw(g);
        // enermy, spaceShip, missile img 화면에 그림(출력)
        b.draw(g);
        }

    @Override
    public void keyPressed(KeyEvent event){
//        System.out.println("눌림");
        spaceShip.keyPressed(event);
        if (event.getKeyCode() == KeyEvent.VK_SPACE){
//            System.out.println("SPACE BAR");
            missile.keyPressed(event, spaceShip.x, spaceShip.y);
        }

        // keyPressed 동작이 있는 객체들 keyPressed 메서드 동작
    }
}
