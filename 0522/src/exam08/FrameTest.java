package exam08;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame("반장" );
        System.out.println("창을 만듬");

        f.setSize(400, 300);
        System.out.println("창의 크기 설정");

        f.setVisible(true);

    }

}
