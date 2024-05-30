import java.util.Arrays;

public class D22MethodEqualsArray {
    // 실수형 배열 2개를 매개변수로 전달받아 두 배열이 서로 동일한지 판별하여
    // boolean을 반환하도록 메서드를 정의
    public static boolean equalsArray(double[] arr1, double[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        double[] arr1 = {1.1, 1.2, 1.3};
        double[] arr2 = {1.1, 1.2, 1.3};

        boolean check = equalsArray(arr1, arr2);
        if (check){
            System.out.println("똑같습니다.");
        } else {
            System.out.println("다릅니다.");
        }
    }
}
