package Grimpan02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

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

        // 주메뉴 "색상"
        Menu menu_color = new Menu("색상");

        // 주메뉴 "파일"
        Menu menu_file = new Menu("파일");

        // 부메뉴 "열기", "저장"
        MenuItem file_open = new MenuItem("열기");
        MenuItem file_save = new MenuItem("저장");

        //부메뉴 "선", "사각형", "원"
        MenuItem draw_line = new MenuItem("선");
        MenuItem draw_rect = new MenuItem("사각형");
        MenuItem draw_oval = new MenuItem("원");

        //부메뉴 "빨강", "파랑", "초록"
        MenuItem draw_red = new MenuItem("빨강");
        MenuItem draw_blue = new MenuItem("파랑");
        MenuItem draw_green = new MenuItem("초록");

        // 주메뉴에 부메뉴 추가
        menu_file.add(file_open);
        menu_file.add(file_save);

        // 주메뉴에 부메뉴 추가
        menu_draw.add(draw_line);
        menu_draw.add(draw_rect);
        menu_draw.add(draw_oval);

        //주메뉴에 부메뉴 추가
        menu_color.add(draw_red);
        menu_color.add(draw_blue);
        menu_color.add(draw_green);

        // 메뉴바에 그리기도구, 색상, 파일 추가
        mb.add(menu_draw);
        mb.add(menu_color);
        mb.add(menu_file);

        // 메뉴바 설정
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

        // draw_line 부메뉴에 액션 추가
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

        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //그린 그래픽의 모든 정보는 패널의 리스트에 담겨있음
                    //그러므로 파일로 출력할 내용은 리스트
                    //자바에는 객체단위로 입출력을 위하여
                    // ObjectInputStream과 ObjectOutputStream을 만들어 두었음
                    // 객체단위의 출력을 위한 ObjectOutputStream객체를 생성함
                    // 이때 생성시에 FileOutputStream의 객체를 매개변수로 전달하여
                    // 생성할 파일의 위치와 이름을 알려줌
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/data/bus.pan"));

                    //ObjectOutputStream객체 oos로 리스트를 출력
                    oos.writeObject(lp.graphicInfos);

                    //파일의 사용이 끝나면 파일 닫음
                    oos.close();

                    System.out.println("파일을 생성하였습니다.");

                }catch (FileNotFoundException ex){
                    ex.printStackTrace();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 객체 단위로 읽어들이기 위한 ObjectInputStream을 생성
                try {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/data/bus.pan"));

                    // 파일로 부터 객체를 읽어들여 패널의 리스트에 담음
                    lp.graphicInfos = (ArrayList<GraphicInfo>) ois.readObject();

                    // 패널의 리스트에 담긴 만큼 그래픽을 그리기 위하여 repaint 를 요청
                    lp.repaint();

                    // 파일의 사용이 끝나면 파일을 닫음
                    ois.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
