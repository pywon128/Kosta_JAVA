public class D08ArrayCopyTestMethod {

    //정수형 배열을 전달받아서 배열의 요소를 모두 출력하는 메서드를 정의
    public static void printArray(int[] arr){
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

        System.out.println("a배열의 요소 ==> ");
        printArray(a);
        System.out.println("b배열의 요소 ==> ");
        printArray(b);


        a[0] = 100;
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);


    }
}
