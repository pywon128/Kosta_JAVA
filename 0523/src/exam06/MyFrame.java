package exam06;

import java.awt.*;

// Gui 프로그래밍을 위하여 자바가 제공하는 Frame을 상속받은 MyFrame 클래스를 만듬
public class MyFrame extends Frame  {
    LinePanel lp;
    // MyFrame의 구성요소(부속품, 맴버변수)로 LinePanel을 선언해요

    public MyFrame(){

        lp = new LinePanel(); // 생성자에서 부속품인 LinePanel을 생성 해 줌

        add(lp); //생성된 LinePanel을 프레임에 담음

        setSize(400,300);   // 프레임의 크기를 설정
        setVisible(true);   // 프레임을 화면에 보여줄 것을 설정

    }
}
