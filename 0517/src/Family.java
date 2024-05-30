public class Family {
    private String name;
    private int age;
    public static String addr;

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

    public Family(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Family() {
    }

    public static void pro(){
        System.out.println("pro 입니다.");
    }

    public void info(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }



}
