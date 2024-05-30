package emp;

// 시간제 직원
public class HourlyEmployee extends Employee {
    private int base;   // 시급
    private int hours;  // 일한시간
    private int salary; // 월급

    public HourlyEmployee(String name, String no, int base, int hours) {
        super(name, no);
        this.base = base;
        this.hours = hours;
    }

    public HourlyEmployee(){

    }

    public int getTimeToMoney() {
        return base;
    }
    public void setTimeToMoney(int base) {
        this.base = base;
    }
    public int getTimeToWork() {
        return hours;
    }
    public void setTimeToWork(int hours) {
        this.hours = hours;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", base=" + base +
                ", hours=" + hours +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void computeSalary() {
        salary = (base * hours)*20;
    }
}
