public class PersonA {
    private String name;
    private int age;

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

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonA() {}

    //PersonA 의 모든 속성정보를 출력하는 메서드를 정의

    public String info(){
//        System.out.println("이름 : "+name);
//        System.out.println("나이 : "+age);

        return "이름 : "+name+", 나이 : "+age;
    }

//    @Override
//    public String toString() {
//        return "PersonA{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
