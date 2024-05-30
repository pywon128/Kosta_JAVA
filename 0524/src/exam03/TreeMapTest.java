package exam03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        Map<String, String> data = new TreeMap<>();

        data.put("name","홍길동");
        data.put("addr", "서울시 종로구 종로1가");
        data.put("phone", "000-0000-0000");

        String addr = data.get("addr");
        System.out.println(addr);
        System.out.println(data);


    }
}
