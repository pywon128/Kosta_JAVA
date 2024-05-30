public class D01ArrayTest {
    public static void main(String[] args){
        int[] data = {10,20,30,40,50};
        /*
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }*/

        for (int i :data){
            System.out.println(i);
        }
    }
}
