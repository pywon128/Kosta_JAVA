public class PersonAtest {
    public static void main(String[] args) {
        PersonA p1 = new PersonA("홍길동", 20);
        PersonA p2 = new PersonA("김유신", 21);

        String str = p1.info();
        System.out.println(str);
        System.out.println(p1.info());

        System.out.println(p2.info());

        System.out.println(p1.toString());
    }
}
