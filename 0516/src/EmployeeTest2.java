class Employee{
    private String name, number;
    private int salary;

    public Employee(){      // 생성자
        name = "asd";
        number = "010-0000-0000";
        salary = 5000;
    }


    public void setName(String name) { this.name = name; }
    public void setNumber(String number) { this.number = number; }
    public void setSalary(int salary) { this.salary = salary; }

    public String getName() { return name; }
    public String getNumber() { return number; }
    public int getSalary() { return salary; }
}

public class EmployeeTest2 {
    public static void main(String[] args){
        Employee em = new Employee();

        System.out.printf("직원 이름 : %s\n직원 번호 : %s\n직원 연봉 : %d만원",
                em.getName(), em.getNumber(), em.getSalary());

    }
}
