package exam02;

import java.util.ArrayList;

public class ArrayListAndLinkedListTest {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();

        data.add("사과");
        data.add("수박");
        data.add("딸기");
        System.out.println(data);

        data.add(1,"복숭아");
        System.out.println(data);

        data.remove(2);
        System.out.println(data);

    }
}
