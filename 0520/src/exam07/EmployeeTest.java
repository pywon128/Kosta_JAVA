package exam07;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee("A", "A0001", 1);
        SalariedEmployee e2 = new SalariedEmployee("B", "B0001", 2);
        HourlyEmployee h1 = new HourlyEmployee("C", "H0001", 100000, 20);

        e1.computeSalary();
        e2.computeSalary();
        h1.computeSalary();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(h1);


    }
}
