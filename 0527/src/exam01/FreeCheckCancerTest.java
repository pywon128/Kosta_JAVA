package exam01;

import java.util.Date;
import java.util.Scanner;

// 사용자한테 주민번호를 입력받아
// 무료암건진 대상자인지 판별하는 프로그램을 작성
// 무료암검진 대상자는 40세이상이고 올해 연도가 홀수면 홀수연도에 태어난 사람 가능,
// 올해가 짝수연도이면 짝수연도에 태어난 사람 가능
// 40세 이상 남자 위암,간암,일반암
// 40세 이상 여자 위암,간암,일반암,자궁암,유방암
// 50세 이상 남자 위암,간암,일반암, 대장암
// 50세 이상 여자 위암,간암,일반암,대장암,자궁암,유방암

public class FreeCheckCancerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thisYear = (new Date()).getYear()+1900;
        String strGender;
        String result = "위암,간암,일반암";

        System.out.print("주민번호 : ");
        String jmNumber = sc.next();

        char gender = jmNumber.charAt((jmNumber.indexOf("-")+1));
        int year = gender=='1'||gender=='2' ?
                Integer.parseInt(jmNumber.substring(0,2))+1900 : Integer.parseInt(jmNumber.substring(0,2))+2000;
        int age = thisYear-year+1;
        strGender = gender=='1'?"남자":"여자";

        System.out.println("출생년도 : "+year);
        System.out.println("나이 : "+age);
        System.out.println("성별 : "+strGender);

        if (age>=40 && thisYear %2 == 0 && year %2 == 0){
            if (age>=50 && gender=='1'){ result += ",대장암"; }
            if (age>=50 && gender=='2'){ result += ",자궁암,유방암"; }
            System.out.println("무료 암검진 대상자 이며 "+result+" 검진 가능합니다.");
        }else { System.out.println("무료 암검진 대상자가 아닙니다."); }
    }
}
