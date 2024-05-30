package exam02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("김유신");
        Person p2 = new Person("이순신");

        p1.start();
        p2.start();
    }
}