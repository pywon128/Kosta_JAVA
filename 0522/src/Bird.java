public abstract class Bird {
    public abstract void sound();
}

class Dove extends Bird{
    public static void main(String[] args) {
        Bird b = new Dove();
        b.sound();
    }

    @Override
    public void sound() {
        System.out.println("coo coo");
    }
}

// Bird b = new Bird();
// 추상 클래스여서 안됨

// Bird b = new Dove();
// 상위 추상클래스인 Bird를 Dove가 확장했고 추상 메서드를 구현한 구현 클래스여서 생성 가능

// 상속관계에 있을 때 하위클래스는 상위클래스에 포함관계에 있기 때문
