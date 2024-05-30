import java.util.Scanner;

public class D05StudentSortTest {

    // 5명 학생의 이름, 국어, 영어, 수학을 입력받아 총점, 평균을 구하고 성적순으로 나열

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] tot = new int[5];
        double[] avg = new double[5];

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d번째 학생의 이름 ==> ", i+1);
            names[i] = sc.next();
            System.out.print("국어 점수 : ");
            kor[i] = sc.nextInt();
            System.out.print("영어 점수 : ");
            eng[i] = sc.nextInt();
            System.out.print("수학 점수 : ");
            math[i] = sc.nextInt();
            tot[i] = kor[i] + eng[i] + math[i];
            avg[i] = tot[i] /3.0;
        }

        System.out.println("*** 성적 처리 결과 ***");
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
                    names[i], kor[i], eng[i], math[i], tot[i], avg[i]);

        }
        String temp_name="";
        int temp_score=0;
        double temp_avg=0.0;
        for (int i = 0; i < tot.length; i++) {
            for (int j = i+1; j < tot.length; j++) {
                if (tot[j]>tot[i]){
                    temp_name = names[i];
                    names[i] = names[j];
                    names[j] = temp_name;

                    temp_score = kor[i];
                    kor[i] = kor[j];
                    kor[j] = temp_score;

                    temp_score = eng[i];
                    eng[i] = eng[j];
                    eng[j] = temp_score;

                    temp_score = kor[i];
                    math[i] = math[j];
                    math[j] = temp_score;

                    temp_score = tot[i];
                    tot[i] = tot[j];
                    tot[j] = temp_score;

                    temp_avg = avg[i];
                    avg[i] = avg[j];
                    avg[j] = temp_avg;
                }
            }
        }
        System.out.printf("*** 총점으로 정렬한 결과 ***\n");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
                    names[i], kor[i], eng[i], math[i], tot[i], avg[i]);
        }
    }
}
