public class D02Ingeritance2A {

    // 접근명시자를 생략하면 dafault 접근명시자로써 동일한 패키지에 있는 클래스들에게만 접근 허용
    // 아무리 상속받은 자식이라 하더라도 동일한 패키지에 잇지 않으면 접근 할 수 없다.
    // 상속받은 자식클래스에게 접근을 허용하려면 protected 사용

    String title;       // 접근명시자 생략
    int year;           // 접근명시자 생략

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
