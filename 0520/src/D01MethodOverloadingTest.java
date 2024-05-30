public class D01MethodOverloadingTest {
    public static void main(String[] args) {
        Myutil mu = new Myutil();

//        int a = mu.max(3,4);
        double b = mu.max(5.1, 5.0);
        double[] c = {1.1, 1.2, 1.3, 1.9, 1.5, 1.6};
        double d = mu.max(c);
        int[] e = {5,4,2,7,1,8,9};


//        System.out.println("int max : "+a);
        System.out.println("double max : "+b);
        System.out.println("double[] max : "+d);
//        System.out.println(mu.max(e));
    }

}