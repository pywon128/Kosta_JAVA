import java.util.Arrays;

public class D04ArrayEqualsTest {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        int cnt=0;
        boolean flag = true;
        if (a.length != b.length){
            flag = false;
        }else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("배열의 내용이 일치합니다.");
        }else {
            System.out.println("배열의 내용이 일치하지 않습니다.");
        }

        /*
        if (a==b){
            System.out.println("배열의 내용이 일치합니다.");
        }else {
            System.out.println("배열의 내용이 일치하지 않습니다.");
        }*/

        /*
        for (int i = 0; i < 5; i++) {
            if (a[i] == b[i]) {
                cnt += 1;
            }
        }
        if (cnt ==5){
            System.out.println("배열의 내용이 일치합니다.");
        }else {
            System.out.println("배열의 내용이 일치하지 않습니다.");
        }
        */
    }
}
