package exam03;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set set = new TreeSet();
        boolean f1 = set.add("보쌈");
        boolean f2 = set.add("모밀");
        set.add("돈까스");
        boolean f3 = set.add("보쌈");

        System.out.println(set);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        System.out.println(set.size());
    }
}
