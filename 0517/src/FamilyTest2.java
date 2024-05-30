public class FamilyTest2 {
    public static void main(String[] args) {
        // static 키워드가 붙어 있는 맴버변수는 객체와 무관하게 사용 가능
        // 클래스 이름으로 접근함 => 클래스 변수
        Family2.addr = "서울시 종로구 관철동";
        System.out.println(Family2.addr);

        Family2 f1 = new Family2("홍길동", 30);
        Family2 f2 = new Family2("홍짱구", 5);
        Family2.pro();
        f1.pro();
        f2.pro();

        System.out.println("-----------------------------------");
        System.out.println(f1.getName()+", "+f1.addr);
        System.out.println(f2.getName()+", "+f2.addr);
        System.out.println("-----------------------------------");
        f1.addr = "제주도 서귀포시";
        System.out.println(f1.getName()+", "+f1.addr);
        System.out.println(f2.getName()+", "+f2.addr);

    }
}