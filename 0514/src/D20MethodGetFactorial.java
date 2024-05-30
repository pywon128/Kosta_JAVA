public class D20MethodGetFactorial {
    // 정수형 변수 n을 매개변수로 전달받아서 n!을 구하여 반환하는 메서드를 정의
    public static int getFactorial(int f){
        int factori = 1;
        for (int i = f; i > 1; i--) {
            factori *= i;
        }
        return factori;
    }
    public static void main(String[] args){
        System.out.println(getFactorial(5));
        int data = getFactorial(3);
        System.out.println(data);
    }
}
