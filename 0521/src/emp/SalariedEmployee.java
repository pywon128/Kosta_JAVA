package emp;

public class SalariedEmployee extends Employee {
    private int level;      // 호봉
    private int salary;     // 월급
    private int base;       // 기본급
    private int allowances; // 수당

    public SalariedEmployee(String name, String no, int level) {
        super(name, no);
        this.level = level;
    }

    public SalariedEmployee() {
    }

    public int getSalary() {
        return salary;
    }
    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", salary=" + salary +
                ", level=" + level +
                ", base=" + base +
                ", allowances=" + allowances +
                '}';
    }

    // 호봉에 따라 기본급, 수당 결정
    @Override
    public void computeSalary() {
        switch (level){
            case 1: base = 4000000; allowances = 400000; break;
            case 2: base = 5000000; allowances = 500000; break;
            case 3: base = 6000000; allowances = 600000; break;
        }
        salary = base+allowances;
    }

}
