public class D16MethodTestMax {
    //두개의 실수를 매개변수로 전달받아 그 중에 큰 수를 찾아 출력하는 메서드를 정의
    public static void maxDouble(double num1, double num2){
        if (num2 > num1){
            System.out.println("큰 수는 "+num2+" 입니다.");
        } else {
            System.out.println("큰 수는 "+num1+" 입니다.");
        }
    }

    public static void main(String[] args){
        double num1 = -1.2, num2 = -1.0;
        maxDouble(num1, num2);
    }
}
