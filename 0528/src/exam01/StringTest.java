package exam01;

// String은 참조 자료형
// 따라서 new String() 처럼 사용해야함
// 문자열은 많이 사용되는 참조자료형 이기 때문에 기본자료형처럼 사용되는 것을 허용 함
// String data = new String("hello");
// String data = "hello";
public class StringTest {
    public static void main(String[] args) {
        String data = new String("hello");
        System.out.println(data);
        data = data + "java";
        System.out.println(data);
    }
}
