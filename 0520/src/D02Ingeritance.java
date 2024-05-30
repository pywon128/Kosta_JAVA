//부모클래스
class A{
    String title;
    int year;
}

//자식클래스
class B extends A{
    String data;

    public void info(){
        System.out.println(title+", "+year+", "+data);
    }

}

public class D02Ingeritance {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B(); // new B() 해서 그안에는 title, year, data 만큼 메모리가 잡힘
        ob2.title = "hello";
        ob2.year = 2024;
        ob2.data = "java";
        System.out.println(ob2.title+", "+ob2.year+", "+ob2.data);


    }
}
