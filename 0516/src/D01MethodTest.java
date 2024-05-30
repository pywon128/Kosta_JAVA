public class D01MethodTest {

    public static String getFirstName(String[] names, int[] scores){
        String result = "";
        int cnt=0, max=0;
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] > max){
                max = scores[i];
                cnt = i;
            }
        }
        result = names[cnt];

        return result;
    }

    public static void main(String[] args){
        String[] name = {"홍길동", "이순신", "유관순", "김유신", "강감찬"};
        int[] score = {80,90,95,70,60};
        System.out.println(getFirstName(name, score));

    }
}
