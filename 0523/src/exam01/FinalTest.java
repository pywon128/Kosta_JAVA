package exam01;

// final method

class A{
    public void pro(){
        System.out.println("A 클래스의 pro 입니다.");
    }

    public final void test(){
        System.out.println("테스트 입니다.");
    }

}

class B extends A{
    public void pro(){
        System.out.println("B 클래스의 pro 입니다.");
    }

//    public void test(){ // 상위 클래스의 final 메서드는 오버라이딩 할 수 없다
//    }

}

public class FinalTest {
    public static void main(String[] args) {
        B ob = new B();
        ob.pro();
    }
}


