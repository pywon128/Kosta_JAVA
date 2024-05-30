package exam01;

public class ReplaceTest {
    public static void main(String[] args) {
        String data = "hello java hello oracle";
//        String data2 = data.replace("hello", "안녕");
        String data2 = data.replaceAll("hello","안녕");
                            // replaceAll 은 정규 표현식도 올 수 있음

        System.out.println("data = " + data);
        System.out.println("data2 = " + data2);
    }
}
