package exam01;

class Person extends Thread{
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(name+"이 밥을 먹어요 ==> "+(i+1));
            try{
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("P");
        Person p1 = new Person("P1");
        Person p2 = new Person("P2");

        p.setPriority(Thread.NORM_PRIORITY);
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p.start();
        p1.start();
        p2.start();
    }
}
