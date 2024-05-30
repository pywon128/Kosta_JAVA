package exam10;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Human 생성자");
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getProfession(){
        return "";
    }


    public static void main(String[] args) {
        Human h1 = new Human("춘향", 18);
        Human h2 = new Human("몽룡", 21);
        Human h3 = new Human("사또", 50);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }

}
