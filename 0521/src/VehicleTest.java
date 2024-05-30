public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.printSpeed();
        System.out.println(v.getKilosPerLiter());
    }
}