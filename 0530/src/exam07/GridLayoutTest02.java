package exam07;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GridLayoutTest02 extends JFrame{


    public GridLayoutTest02(){
        setLayout(new GridLayout(3,5));
// 설정한 그리드의 수와 컴포넌트의 수가 맞지 않으면 컴포넌트에 수에 알아서 맞추어 줌(행만 맞춤?)
        // 단 알맞게 떨어지지 않으면 빈 공간 생김
        for (int i = 1; i <=12 ; i++) {
            add(new JButton("버튼"+i));
        }

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }


    public static void main(String[] args) {
        new GridLayoutTest02();
    }
}
