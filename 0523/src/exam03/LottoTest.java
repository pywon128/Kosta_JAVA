package exam03;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// 로또번호는 1~45 까지의 숫자를 중복이 되지 않게 6개
public class LottoTest {
    public static void main(String[] args) {
        Set lotto = new TreeSet();
        Random r = new Random();

//        while (true){
//            if (lotto.size() == 6){
//                break;
//            }
//            lotto.add(r.nextInt(45)+1);
//        }

        while (lotto.size() < 6 ){
            lotto.add(r.nextInt(45)+1);
        }
        System.out.println("lotto = " + lotto);
        // lotto = [5, 11, 14, 19, 24, 32]
    }
}
