package exam09;

public class Boom extends GraphicObject {
    public Boom(String fileName) {
        super(fileName);

        x = -100;
        y = -100;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
