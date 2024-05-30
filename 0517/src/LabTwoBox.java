public class LabTwoBox {
    int width;
    int length;
    int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return width*length*height;
    }

    public LabTwoBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public LabTwoBox() {
    }

    @Override
    public String toString() {
        return "LabTwoBox{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
