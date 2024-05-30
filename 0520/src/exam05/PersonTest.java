package exam05;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("홍길동","서울시 종로구 관철동", "010-1111-1111");
        Customer c = new Customer("김유신", "서울시 종로구 인사동", "010-2222-2222", 1001, 10000);

        System.out.println("*** Person의 정보 ***");
        System.out.println(p);
//        System.out.println("이름 : "+p.getName());
//        System.out.println("주소 : "+p.getAddr());
//        System.out.println("전화 : "+p.getPhone());
        System.out.println("------------------------------");
        System.out.println("*** Customer의 정보 ***");
        System.out.println(c);
//        System.out.println("이름 : "+c.getName());
//        System.out.println("주소 : "+c.getAddr());
//        System.out.println("전화 : "+c.getPhone());
//        System.out.println("고객번호 : "+c.getNo());
//        System.out.println("마일리지 : "+c.getMileage());


    }
}
