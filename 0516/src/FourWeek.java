import java.util.Arrays;
import java.util.Scanner;

public class FourWeek {
    public static String getInput(String text){
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        return sc.nextLine();
    }

    public static void getConvert(String[] result, int[] dateOfBirth){
        int shiftNum = dateOfBirth[0];

        String[] resultArray = {
                "천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"
        };
        result[0] = resultArray[shiftNum];    // 시작 인덱스(띠를 천술 인덱스로 바꾼 값) 값(resultArray)을 저장

        for (int i = 1; i < result.length ; i++) {
            shiftNum += dateOfBirth[i];
            if (shiftNum > 12){
                shiftNum %= 12;
            }
//            System.out.println("shiftNum = " + shiftNum);
//            System.out.println("resultArray = " + resultArray[shiftNum]);
            result[i] = resultArray[shiftNum];
        }
    }

    public static int setStartNumber(String inputStrYear){
        // 띠를 입력받아 천술의 시작 index 번호를 리턴하는 메서드 (0~11)
        int start=0;
        String[] animals = {
                "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};
        for (String animal : animals){
            if (animal.equals(inputStrYear)){
                return start;
            }
            start++;
        }
        System.out.println("잘못된 입력입니다.");
        return -1;
    }

    public static int setBirth(int month, int day){
        // 생월과 생일을 입력받아 천술의 index 번호로 변환하여 setDay 를 리턴하는 메서드 (0~11)
        int setDay, lastDay = 31;
        if (month == 2) lastDay = 28;
        else if (month==4||month==6||month==9||month==11) lastDay = 30;

        if (month >= 1 && month <= 12 && day > 0 && day <= lastDay){
            setDay = (day-1)%12;
            return setDay;
        }
        System.out.println("잘못된 입력입니다.");
        return -1;
    }

    public static int setTime(int inputTime){
        // 생시를 입력받아 천술의 index 번호로 변환하여 setTime 를 리턴하는 메서드 (0~11)
        // 23~24, 1~2, 3~4, 5~6, 7~8, 9~10, 11~12, 13~14, 15~16, 17~18, 19~20, 21~22
        int setTime;
        if (inputTime >= 1 && inputTime <= 24){
            setTime = (((inputTime-1)/2)+1)%12;
            return setTime;
        }
        System.out.println("잘못된 입력입니다.");
        return -1;
    }

    public static void main(String[] args){
        String inputName, inputStrYear;
        int inputMonth, inputDay, inputTime;

        String[] result = new String[4];    // 천술을 기록할 배열
        int[] dateOfBirth = new int[4];     // 생년(띠),생월,생일,생시를 천술 index 로 변환한 값을 저장하는 배열

        while (true){
            inputName = getInput("이름을 입력하세요 : ");
            inputStrYear = getInput("띠(동물)를 입력하세요 : ");
            dateOfBirth[0] = setStartNumber(inputStrYear);
            if (dateOfBirth[0] >= 0){
                inputMonth = Integer.parseInt(getInput("생월을 입력하세요 : "));
                dateOfBirth[1] = inputMonth-1;
                inputDay = Integer.parseInt(getInput("생일을 입력하세요 : "));
                dateOfBirth[2] = setBirth(inputMonth, inputDay);
                if (dateOfBirth[2] >= 0){
                    inputTime = Integer.parseInt(getInput("생시를 입력하세요(1~24) : "));
                    dateOfBirth[3] = setTime(inputTime);
                    if (dateOfBirth[3] >= 0){
//                        System.out.println("dateOfBirth = " + Arrays.toString(dateOfBirth));
                        getConvert(result, dateOfBirth);
                    } else continue;
                } else continue;
            } else continue;

            System.out.println("******* 출력 *******");
            System.out.printf("%s님\n생년 : %s띠\t|\t%s\n생월 : %d\t|\t%s\n생일 : %d\t|\t%s\n생시 : %d\t|\t%s\n",
                    inputName, inputStrYear, result[0], inputMonth, result[1], inputDay, result[2], inputTime, result[3]);
        } // while
    } // main
} // class