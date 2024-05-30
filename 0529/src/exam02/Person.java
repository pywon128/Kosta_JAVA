package exam02;

public class Person extends Thread{
    private String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("hello, "+name+" ==> "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
