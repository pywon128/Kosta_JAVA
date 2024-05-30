public class D03MethodCallByValue {

    //정수형 변수 하나를 매개변수로 전달받아 1증가하여 출력하는 메서드
    public static void add(int n){
        n = n+1;
        System.out.println("n = " + n);
    }

    public static void main(String[] args){
        int n = 5;
        add(n);
        System.out.println("n = " + n);
    }
}
