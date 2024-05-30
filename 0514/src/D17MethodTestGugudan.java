public class D17MethodTestGugudan {
    // 몇단을 출력할지를 매개변수로 전달받아 해당하는 구구단을 출력하는 메서드를 정의
    public static void Gugu(int dan){
        if (dan <2 || dan > 9){
            return;
        }

        System.out.printf("*** %d 단 ***\n",dan);
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d * %d = %d\n",dan, i, dan*i);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int dan = 5;
        Gugu(dan);
        Gugu(100);
        Gugu(8);
    }
}
