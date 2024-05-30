public class ProgrammingDog {
    private String name;
    private int age;
    public static String breed;

    public ProgrammingDog(String name, String breed, int age) {
        this.name = name;
        ProgrammingDog.breed = breed;
        this.age = age;
    }

    public ProgrammingDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ProgrammingDog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "breed="+ ProgrammingDog.breed+'\'' +
                ", age=" + age +
                '}';
    }
}
