package exam03;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        boolean f1 = set.add("보쌈");
        boolean f2 = set.add("모밀");
        set.add("돈까스");
        set.add("보쌈");

        System.out.println(set);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }
}
