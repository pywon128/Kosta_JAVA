public class D26MatrixTest {
    // 정수형의 2차원 배열을 매개변수로 전달받아 모든 요소를 출력하는 메서드를 정의하고 호출
    public static void printDualArray(int[][] arr){
        for (int[] dArr : arr) {
            for (int num : dArr){
                System.out.printf("%5d",num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] a = {10,20,30,40,50};
        int[][] b = {
                    {10,20,30},
                    {40,50,60},
                    {70,80,90},
                    {100,110,120}
                    };
        int[][] c = {
                    {1,2,3,4,5},
                    {6,7},
                    {8,9,10}
                    };
        printDualArray(b);
        System.out.println("=====================================");
        printDualArray(c);
    }
}
