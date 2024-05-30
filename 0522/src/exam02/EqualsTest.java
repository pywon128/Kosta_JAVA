package exam02;

public class EqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person("A", 20);
        Person p2 = new Person("A", 20);

        System.out.println(p1);
        System.out.println(p2);

        Person p3 = p1;

        //객체 참조 변수는 값을 가지고 있는 것이 아니라
        //값이 있는 객체의 메모리를 참조하고 있기 때문에
        //p1이 참조하고 있는 객체 p2가 참조하고 있는 객체가 서로 다름

        if (p1 == p2){
            System.out.println("같아요");
        }else {
            System.out.println("달라요");
        }

        p1.setName("B");
        System.out.println(p1.getName());
        System.out.println(p3.getName());

        p1 = null;

        System.out.println(p3);


        if (p1 == p3){
            System.out.println("같아요");
        }else {
            System.out.println("달라요");
        }


    }
}
