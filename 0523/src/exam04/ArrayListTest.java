package exam04;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("된찌");
        data.add("돈까");
        data.add("냉면");
        data.add("김찌");
        data.add("냉면");
        data.add(100);

        System.out.println(data);
        // List 는 인덱스에 의해 데이터에 접근
        String str = (String) data.get(1);
        int qty = (Integer) data.get(5);

        System.out.println(str+", "+qty);

    }
}
