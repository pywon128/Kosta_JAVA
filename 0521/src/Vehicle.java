abstract class Vehicle {
    protected int speed=10;

    public void printSpeed(){
        System.out.println("현재 속도 : "+speed);
    }

    public abstract double getKilosPerLiter();
}
