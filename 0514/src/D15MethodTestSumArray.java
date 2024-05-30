import java.util.Scanner;

public class D15MethodTestSumArray {
    // 정수형 배열을 매개변수로 전달받아 배열의 총합을 누적하여 출력하는 메서드 정의
    public static void printSumArray(int[] arr){
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("총합 : "+sum);
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int[] arr2 = {11,12,13,14,15};

        printSumArray(arr);
        printSumArray(arr2);
    }
}
