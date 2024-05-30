package exam03;

import java.util.*;

// 컴퓨터와 사용자가 가위,바위,보 하는 게임을 만들기
public class GameTestMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Map<String, Integer> conv = new HashMap<>();
        conv.put("가위",0);
        conv.put("바위",1);
        conv.put("보",2);
//        Map<Integer, String> map = new HashMap<>();
//        map.put(0,"가위");
//        map.put(1,"바위");
//        map.put(2,"보");

        String user;
        int computer = r.nextInt(3);

        System.out.println(computer);
        System.out.print("입력 : ");
        user = sc.next();
        int userNum = conv.get(user);

        if (computer == userNum){
            System.out.println("무승부!");
        } else if ((userNum == 0 && computer ==2)||(userNum==1&&computer==0)||(userNum==2&&computer==1)){
            System.out.println("user 승!");
        } else {
            System.out.println("Computer 승!");
        }

//        if (userNum == computer){
//            System.out.println("무승부!");
//        } else if (userNum==0 && computer==2){
//            System.out.println("user 승!");
//        } else if (computer==0 && userNum==2) {
//            System.out.println("Computer 승!");
//        } else if (userNum > computer){
//            System.out.println("user 승!");
//        }else {
//            System.out.println("Computer 승!");
//        }




    }
}
