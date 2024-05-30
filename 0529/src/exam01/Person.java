package exam01;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello, "+name+" ==> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}