package exam03;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public boolean equals(Object obj){
        boolean re = false;
        Person p = (Person) obj;
        if (name.equals(p.name)){   // Person p = (Person) obj 안쓰려면
                                    // ((Person)obj).name 하면 됨
            re = true;
            System.out.println("같음");
        }

        return re;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
