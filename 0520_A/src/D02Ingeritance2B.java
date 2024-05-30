public class D02Ingeritance2B extends D02Ingeritance2A{
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void info(){
        System.out.println(title+year+data);
        // 아무리 상속받은 자식 클래스라 해도
        // 부모클래스의 private 영역에는 접근할 수 없다.
        // protected 를 사용하면 자식클래스에서 사용 가능

    }

}
