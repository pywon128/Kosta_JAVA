package exam01;

public class IndexOfSubStringTest {
    public static void main(String[] args) {
        String email = "tigerJK@naver.com";
//        int n = email.indexOf("@");
//        String id = email.substring(0,n);
        String id = email.substring(0, email.indexOf("@"));
        System.out.println("id = " + id);
    }
}