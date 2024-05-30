package exam06;

import exam07.GraphicInfo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

//panel 은 복잡한 화면구성을 위한 서브컨테이너 역할이나 그래픽을 표현하기 위하여 사용하는 화면구성요소
//LinePanel 은 그래픽을 표현하기 위하여 panel 클래스로부터 상속받고
// 마우스 움직임에 대한 이벤트 처리를 위하여 MouseListener 인터페이스를 구현
public class LinePanel extends Panel implements MouseListener {

    int x1, y1, x2, y2;
    // 현재의 그래픽(선)의 시작점 x1, y1과 끝점 x2,y2를 저장하기 위한 맴버변수를 선언

    // 그려진 모든 선을 보이기 위해 리스트를 만듬
    ArrayList<GraphicInfo> gpi = new ArrayList<>();
    // 화면에 그려진 모든 그래픽(선)을 담기 위하여 리스트를 선언
    // 리스트에는 그래픽의 정보를 표현하기 위한 GraphicInfo만 담도록 한정함

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        // 마우스가 눌러졌을때 동작하는 메서드이며
        // 눌러진 마우스의 위치정보를 매개변수 MouseEvent e가 받아옴
        // 이를 통해 마우스가 눌러진 x,y를 그래픽(선)의 시작점인 x1, y1 에 저장
        x1 = e.getX();
        y1 = e.getY();
        System.out.println("마우스 눌러짐");

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // 마우스가 때어졌을 때 동작하느 메서드이며
        // 눌렀다 때어진 마우스의 위치정보를 매개변수 MouseEvent e 가 받아옴
        // 이를 통해 마우스가 때어진 위치 x, y를 그래픽(선)의 끝점인 x2, y2에 저장
        x2 = e.getX();
        y2 = e.getY();
        System.out.println("마우스 때어짐");

        // 현재 그려진 그래픽(선)의 시작점 x1, y1 / 끝점 x2, y2를
        // 가지고 GraphicInfo 객체를 생성하여 리스트에 담음
        gpi.add(new GraphicInfo(x1, y1, x2, y2));

        // paint 메서드가 실행됨
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // GUI프로그래밍 에서는 화면을 다시 그려줘야 할 필요가 있으면 다음의 paint 메서드가 자동으로 동작함
    // 처음 LinePanel 을 생성하여 프레임에 담으면 이 paint 메서드가 자동으로 동작하고
    // 프레임의 크기를 조절하면 그 속에 있는 패널의 크기도 변경되기 대문에
    // 그때도 paint가 자동으로 동작
    // 무언가 다시 그려줘야 하면 paint가 자동으로 동작함
    // paint를 직접 호출할 수 없고 repaint 메서드를 호출하여 paint를 요청
    @Override
    public void paint(Graphics g) {

        //사용자가 그려진 그래픽(선)의 모든 정보는 리스트에 담겨 있음
        // 리스트의 담긴 요소만큼 반복실행하여 모든 그래픽 선을 다시 그려줌
        for (GraphicInfo graphicInfos : gpi){
            g.drawLine(graphicInfos.getX1(), graphicInfos.getY1(),
                    graphicInfos.getX2(), graphicInfos.getY2());
        }

    }


    public LinePanel() {    // LinePanel 생성자 이면 객체생성시에 자동 동작
        addMouseListener(this);
        // 현재 패널인 LinePanel에 마우스 이벤트 처리담당자가 자신임을 등록함
    }

}
