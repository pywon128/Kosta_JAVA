import java.util.Arrays;

public class D04MethodCallByReference {
    // 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 1씩 증가하는 메서드
    public static void arrayAdd(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] += 1;
        }
        System.out.println("함수호출 a = " + Arrays.toString(a));
    }

    public static void main(String[] args){
        int[] a = new int[4];
        System.out.println("초기 a = " + Arrays.toString(a));
        arrayAdd(a);

        System.out.println("함수 호출 이후 a = " + Arrays.toString(a));
    }

}
