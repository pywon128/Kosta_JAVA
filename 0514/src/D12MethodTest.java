public class D12MethodTest {

    public static void sayHello(int cnt){
        for (int i = 0; i <cnt; i++) {
            System.out.println("시우야 안녕");
        }
    }

    public static void main(String[] args){

        sayHello(2);
        String title = "KOSTA 교육센터";
        System.out.println(title);
        sayHello(5);
        int year = 2024;
        System.out.println(year);
        sayHello(10);

    }

}
