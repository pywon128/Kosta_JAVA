import java.util.Scanner;

public class Programming2 {

    public static boolean isPassed(int right){
        return right >= 7;
    }

    public static int correctAnswers(){
        System.out.println("정답입니다.");

        return 1;
    }

    public static int incorrectAnswers(){
        System.out.println("오답입니다.");

        return 0;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int right = 0, wrong = 0;
        String result = "불합격";
        String input;
        String[] p = {
                "문제: 캐나다의 수도는 ?\na)밴쿠버  b)토론토   c)오타와   d)재스퍼",
                "문제: 대한민국의 수도는 ?\na)캐나다 b)일본    c)서울    d)다낭",
                "문제: 일본의 수도는 ?\na)마닐라   b)도쿄    c)태국    d)중국",
                "문제: 필리핀의 수도는 ?\na)마닐라  b)오타와   c)몽골    d)상하이",
                "문제: 중국의 수도는 ?\na)타이완   b)몽골    c)도쿄    d)상하이",
                "문제: 미국의 수도는 ?\na) 하와이  b)LA    c)워싱턴DC d)LA갈비",
                "문제: 몽골의 수도는 ?\na)울란바토르   b)울트라   c)토론토   d)재스퍼",
                "문제: 남아공의 수도는 ?\na)케이크    b)케이프타운 c)KFC   d)맥너겟",
                "문제: 호주의 수도는 ?\na)싱가포르    b)나드리   c)시드니   d)후쿠오카",
                "문제: 싱가포르의 수도는 ?\na)말레이시아 b)싱가포르  c)LA  d)몽골"
        };
        String[] a = {"c", "c", "b", "a", "d", "c", "a", "b", "c", "b"};

        for (int i = 0; i < 10; i++) {
            System.out.println(p[i]);
            System.out.print("정답 알파벳 입력 : ");
            input = sc.next();

            if (input.equals(a[i])){
                right += correctAnswers();
            }else{
                wrong += incorrectAnswers();
            }
        }

        if (isPassed(right)){
            result = "합격";
        }

        System.out.printf("정답 개수 : %d\n오답 개수 : %d\n%s",right,wrong,result);

    }
}
