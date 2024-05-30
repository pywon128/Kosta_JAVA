public class Family2 {
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

    public Family2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Family2() {
    }

    public static void pro(){
//        name = "홍길동"; //에러 -> static 메서드(클래스 메서드)는 static 으로 선언된 변수와 메서드에만 접근 가능
        System.out.println("pro 입니다.");
        pro2();
    }

    public static void pro2(){
        System.out.println("pro2 입니다.");
//        info(); // 에러
    }

    public void info(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }



}
