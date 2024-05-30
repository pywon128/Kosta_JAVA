public class D13MethodTest {

    public static void sayHello(String name , int cnt){
        for (int i = 0; i <cnt; i++) {
            System.out.printf("%s 안녕\n",name);
        }
    }

    public static void main(String[] args){
        sayHello("시우",2);
        String title = "KOSTA 교육센터";
        System.out.println(title);
        sayHello("유나",5);
        int year = 2024;
        System.out.println(year);
        sayHello("석영",10);

    }
}
