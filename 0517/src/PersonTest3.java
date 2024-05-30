class Person{
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}


public class PersonTest3 {
    public static void main(String[] args) {
        // 사용자가 생성자를 만들기 시작하면 더이상 기본생성자를 제공하지 않음
        // 필요하다면 사용자가 만들어서 사용해야 함
        Person p = new Person("홍길동",20,178.3);

        System.out.println(p.getName()+", "+p.getAge()+", "+p.getHeight());

        Person p1 = new Person("홍길동",20,178.3);
        System.out.println(p1.getName()+", "+p1.getAge()+", "+p1.getHeight());
    }
}