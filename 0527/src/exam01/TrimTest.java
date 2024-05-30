package exam01;

public class TrimTest {
    public static void main(String[] args) {
        String data = "   hello  ";
        System.out.println("|"+data+"|");
        System.out.println(data.trim());
        System.out.println("|"+data.trim()+"|");
    }
}
