package exam03;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("김유신");
        Person p2 = new Person("이순신");

        new Thread(p1).start();
        new Thread(p2).start();
    }
}
