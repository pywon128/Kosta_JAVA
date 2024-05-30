package exam08;

// 하나의 그래픽에 대한 정보를 표현하기 위한 새로운 클래스
// 그래픽이 "선"이기 때문에 선의 정보인 시작점 x1, y1 / 끝점 x2, y2로 구성되는 클래스
public class GraphicInfo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public GraphicInfo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public GraphicInfo() {
    }

    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
}
