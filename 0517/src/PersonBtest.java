public class PersonBtest {
    public static void main(String[] args) {
        PersonB p1 = new PersonB("홍길동", 20);
        PersonB p2 = new PersonB("김유신", 21);

        System.out.println(p1);
        System.out.println(p2);
        //PersonB@2f4d3709
        //PersonB@4e50df2e
        // toString 을 만든 후에는 아래와 같이 나옴
//        PersonB{name='홍길동', age=20}
//        PersonB{name='김유신', age=21}

        // print(p1) = print(p1.toString)
    }
}
