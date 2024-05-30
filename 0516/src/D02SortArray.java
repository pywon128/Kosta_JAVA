import java.util.Arrays;

public class D02SortArray {
    public static void main(String[] args){
        int[] a = {17,16,15,7,9,11};
        int temp;
        for(int i =0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if ( a[j] < a[i] ){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
