public class LabOnePointTest {
    public static void main(String[] args) {
        LabOnePoint p1 = new LabOnePoint();

        p1.setX(100);
        p1.setY(200);

        LabOnePoint p2 = new LabOnePoint(100,300);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
