public class ProgrammingBox {
    private double width;
    private double length;
    private double height;
    private boolean empty;

    public ProgrammingBox(double width, double length, double height, boolean empty) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.empty = empty;
    }

    public ProgrammingBox() {
    }

    @Override
    public String toString() {
        return "ProgrammingBox{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", empty=" + empty +
                '}';
    }
}
