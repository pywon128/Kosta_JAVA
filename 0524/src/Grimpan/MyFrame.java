package Grimpan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame  {
    DrawPanel lp;

    public MyFrame(){
        lp = new DrawPanel();
        Color drawColor;
        add(lp);

        //메뉴바 생성
        MenuBar mb = new MenuBar();

        //주메뉴 "그리기도구"
        Menu menu_draw = new Menu("그리기도구");
        Menu menu_color = new Menu("색상");


        //부메뉴 "선", "사각형", "원"을 만듦
        MenuItem draw_line = new MenuItem("선");
        MenuItem draw_rect = new MenuItem("사각형");
        MenuItem draw_oval = new MenuItem("원");

        MenuItem draw_red = new MenuItem("빨강");
        MenuItem draw_blue = new MenuItem("파랑");
        MenuItem draw_green = new MenuItem("초록");

        menu_draw.add(draw_line);
        menu_draw.add(draw_rect);
        menu_draw.add(draw_oval);

        menu_color.add(draw_red);
        menu_color.add(draw_blue);
        menu_color.add(draw_green);

        mb.add(menu_draw);
        mb.add(menu_color);

        setMenuBar(mb);

        setSize(400,300);
        setVisible(true);

        //각각의 메뉴가 눌러졌을 때 동작하도록 메뉴 이벤트 등록
        //자바에서는 클래스안에 클래스를 만들 수 있음
//        class MyLineEvent implements ActionListener{
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("선그리기 눌렀음");
//            }
//        }

//        MyLineEvent me = new MyLineEvent();
//        draw_line.addActionListener(me);
//        draw_line.addActionListener(new MyLineEvent());

        draw_line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lp.setDrawType(0);
//                System.out.println("선그리기를 선택");
            }
        });
        draw_rect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lp.setDrawType(1);
//                System.out.println("사각형 그리기를 선택");
            }
        });
        draw_oval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lp.setDrawType(2);
//                System.out.println("원 그리기를 선택");
            }
        });
        draw_red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lp.drawColor = Color.red;
            }
        });
        draw_blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lp.drawColor = Color.blue;
            }
        });
        draw_green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lp.drawColor = Color.green;
            }
        });
    }
}
