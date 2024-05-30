public class D25MatrixRowTest {
    public static void main(String[] args){
        int[][] a = new int[3][];

        a[0] = new int[5];
        a[1] = new int[2];
        a[2] = new int[10];

        int n = 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]= n++;
            }
        }
        /*
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.println();
        }*/
        for (int[] arr : a){
            for (int num : arr){
                System.out.printf("%5d",num);
            }
            System.out.println();
        }

    }
}
