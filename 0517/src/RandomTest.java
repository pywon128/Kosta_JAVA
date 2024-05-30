public class RandomTest {
    public static void main(String[] args) {
        double data = Math.random();
        System.out.println(data*6);

        // 1~6 사이의 난수 발생
        int n = (int) (Math.random()*6)+1;
        System.out.println(n);
    }
}
