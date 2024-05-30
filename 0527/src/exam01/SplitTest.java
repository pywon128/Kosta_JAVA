package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitTest {
    public static void main(String[] args) {
        String data = "A,B,C,D,E";
        String data1 = "a b c d e f g h i j k";

        String[] splitData = data.split(",");
        System.out.println(Arrays.toString(splitData));

        String[] splitData1 = data1.split(" ");
        System.out.println(Arrays.toString(splitData1));

        /*
        split 메서드는 String 의 메서드이며 문자열을 특정문자로 분리하여 배열을 반환하는 메서드

        애초에 문자열 분리를 담당하는 클래스인 StringTokenizer 를 이용하여 문자열을 분리할 수 있음
         */

        StringTokenizer sT = new StringTokenizer("a b c d e f g"," ");
        // 분리된 데이터(값) 하나하나는 토근이라고 부름
        // 토큰을 하나씩 끄집어 내어 오는 메서드는 nextToken();
        // 보통 토근이 있는 만큼 반복 실행
        // 다음 토큰이 있는지 물어보고 반복실행 => hasMoreTokens();

        while (sT.hasMoreTokens()){
            System.out.println(sT.nextToken());
        }
    }
}
