public class D09ArrayCopyTestMethod {

    //정수형 배열을 전달받아서 배열의 요소를 모두 출력하는 메서드를 정의
    public static void printArray(String title, int[] arr){
        System.out.print(title);
        for (int data : arr){
            System.out.printf("%5d", data);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        //b = a;

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        printArray("a배열의 요소==>",a);
        printArray("b배열의 요소==>",b);

        a[0] = 100;
        printArray("a배열의 요소==>",a);
        printArray("b배열의 요소==>",b);
    }
}
