public class D07ArrayCopyTest {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        //b = a;

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("a배열의 요소");
        for (int data : a){
            System.out.printf("%5d", data);
        }
        System.out.println();
        System.out.println("b배열의 요소");
        for (int data : b){
            System.out.printf("%5d", data);
        }
        System.out.println();

        a[0] = 100;
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);


    }
}
