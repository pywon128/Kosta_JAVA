public class D18MethodMaxArray {
    // 정수형 배열을 매개변수로 전달받아 가장 큰 값을 찾아서 출력하는 메서드를 정의
    public static void printMaxArray(int[] arr){
        // 0   1  2  3  4      <-- i
        // 9  10  5  7  6      <-- arr

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("배열에서 가장 큰 값은 = "+max+" 입니다.");
    }

    public static void main(String[] args){
        int[] arr = {9,10,5,7,6};
        printMaxArray(arr);
    }
}