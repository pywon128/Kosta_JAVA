package exam01;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("홍석영", "010-1234-5678");
        map.put("임유나", "010-1111-1111");
        map.put("변시우", "010-2222-2222");
        map.put("조영흔", "010-3333-3333");

        // Map의 모든 Key를 갖고 옴
//        System.out.println(map.keySet());
        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println("이름 : "+key+"\n전화번호 : "+map.get(key));
        }
//        System.out.println(map.containsKey("홍석영"));
    }
}
