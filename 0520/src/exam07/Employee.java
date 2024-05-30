package exam07;

public class Employee {
    protected String name;  // 이름
    protected String no;    // 사번

    public Employee() {
    }

    public Employee(String name, String no) {
        this.name = name;
        this.no = no;
    }

    // 급여를 계산하는 메서드
    public void computeSalary(){
        // 월급제 사원과 시간제 사원의 급여 계산방식이 다르기 때문에
        // 부모클래스를 만드는 시점에서 메서드의 body를 구체화 할 수 없다.
        // 일단 비워둠
    }
}
