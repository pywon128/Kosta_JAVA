public class PlaneTest {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        Plane p2 = new Plane();
        Plane p3 = new Plane();

        p1.setCompany("에어버스");
        p1.setModel("A380");
        p1.setPassengers(500);
        p2.setCompany("비버스");
        p2.setModel("B380");
        p2.setPassengers(250);

        System.out.println(p1.getCompany());
        System.out.println(p1.getModel());
        System.out.println(p1.getPassengers());
        System.out.println(p2.getCompany());
        System.out.println(p2.getModel());
        System.out.println(p2.getPassengers());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        int planesNum = Plane.getPlanes();
        System.out.println("planesNum = " + planesNum);

    }
}
