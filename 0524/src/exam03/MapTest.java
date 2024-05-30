package exam03;

import java.awt.*;
import java.util.ArrayList;

public class MapTest {
    public static void main(String[] args) {
        // 어떤 사람의 이름, 나이, 키를 리스트에 담기
        ArrayList<String> data = new ArrayList<>();
        data.add("홍길동");
        data.add("서울시 종로구 종로2가");
        data.add("000-0000-0000");
        // 위의 코드의 경우 이 사람의 전화번호를 가지고 오려면 전화번호가 2번째 인덱스라는 것을 알아야 함
        // 각 요소의 데이터를 어떤 의미를 가지고 있을 때 인덱스로 접근하는 방식 보다는 key로 데이터에 접근하는게
        // 더 직관적

    }
}
