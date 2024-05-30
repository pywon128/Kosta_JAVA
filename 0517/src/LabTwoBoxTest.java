public class LabTwoBoxTest {
    public static void main(String[] args) {
        LabTwoBox box1 = new LabTwoBox();

        box1.setWidth(100);
        box1.setLength(100);
        box1.setHeight(100);

        System.out.println("box1.getVolume = "+ box1.getVolume());
        System.out.println(box1);

        LabTwoBox box2 = new LabTwoBox(200,200,200);
        box1.setWidth(box2.width);
        box1.setLength(box2.length);
        box1.setHeight(box2.height);

        System.out.println("box1.getWidth = "+box1.getWidth());
        System.out.println("box1.getLength = "+box1.getLength());
        System.out.println("box1.getHeight = "+box1.getHeight());







    }
}
