public class D03ArrayForEach {
    public static void main(String[] args){
        int[] numbers = new int[5];
                                      //  0   1   2   3   4
        for (int i = 0; i < 5; i++) { // [1] [2] [3] [4] [5]
            numbers[i] = i+1;
        }

        for (int i : numbers){
            System.out.print("i" + i +"==>");
            System.out.println(numbers[i]);
        }
    }
}
