public class Myutil {
    // 두개의 정수를 매개변수로 전달받아 그 중에 큰 수를 찾아 반환하는 메서드를 정의

//    public int max(int a, int b){
//        int max = a;
//        if (a < b){ max = b; }
//        return max;
//    }
    // 두개의 실수를 매개변수로 전달받아 그 중에 큰 수를 찾아서 반환하는 메서드를 정의
    public double max(double a, double b){
        if (b > a){
            a = b;
        }
        return a;
    }

    // 실수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아서 반환하는 메서드를 정의
    public double max(double[] arr){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //int 배열을 max에게 전달하면 어떻게 될까요? double 배열 max
}