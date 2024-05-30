package exam03;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set data = new HashSet();
        boolean f1 = data.add(100); // add(Object e) 인데 자동으로 객체로 만들어줌 auto boxing
        boolean f2 = data.add("사과");
        boolean f3 = data.add(56.7);
        data.add(true);
        boolean f4 = data.add(100);

        System.out.println(data);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
    }
}
