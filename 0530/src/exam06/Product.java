package exam06;

import java.util.Random;

// 생산자와 소비자가 공유할 자원인 "제품" 클래스를 만듦
// 새로운 정수를 제품이라 봄
public class Product {

    // 제품을 위한 정수형 변수를 선언
    // 생산자는 이 정수를 계속하여 새롭게 만들고
    // 소비자는 이 정수를 계속하여 가져다 쓰도록 함
    int number;

    // 새 제품이 생산되었는지 판별하기 위한 변수
    // 생산자는 새 제품을 생산한 다음 isNew 에 true 를 저장하고
    // 소비자는 isNew 가 ture 일 때 제품을 소비하고 isNew 에 false 를 저장함
    boolean isNew;

    // 생산자가 새 제품을 생산하기 위한 메서드
    // 생산자가 새 제품을 만들고 있는동안 소비자는 접근을 못해야 하므로
    // 임계영역 설정을 위하여 synchronized 키워드를 붙임
    public synchronized void makeNumber(){
        Random r = new Random();

        try{
            while (isNew){
                wait();     // 제품이 소비될 때 까지 기다림
            }

            // 새 제품을 만듦
            number = r.nextInt(100)+1;

            // 생산된 제품을 출력
            System.out.println("생산자가 생산함 ==> "+number);

            // 새 제품을 만들었다고 표시
            isNew = true;

            // 대기중인 소비자를 깨움
            notify();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // 소비자가 사용하는 메서드
    public synchronized int useNumber(){
//        int n = number;

        try {
            while (!isNew){     // 생산자가 새로운 제품을 생산할 때 가지 기다림
                wait();
            }
            System.out.println("제품을 사용 ==> "+number);

            // 제품을 소비 했다고 표시
            isNew = false;

            // 대기중인 다른 쓰레드(생산자)를 깨워줌
            notify();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return number;
    }


}
