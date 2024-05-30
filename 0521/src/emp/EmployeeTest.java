package emp;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel, level, base, hours, i=0;
        String name, no;

        Employee[] employees = new Employee[100];

        while (true){
            System.out.println("*** 사원 선택 ***");
            System.out.print("1.월급제 사원 / 2. 시간제 사원 : ");
            sel = sc.nextInt();
            if (sel > 2 || sel < 0){
                continue;
            }
            if (sel == 0){
                break;
            }

            System.out.print("이름 : ");
            name = sc.next();
            System.out.print("사원번호 : ");
            no = sc.next();

            switch (sel){
                case 1:
                    System.out.print("호봉 : ");
                    level = sc.nextInt();
                    employees[i] = new SalariedEmployee(name, no, level);
                    employees[i].computeSalary(); break;

                case 2: ;
                    System.out.print("시급 : ");
                    base = sc.nextInt();
                    System.out.print("근무시간 : ");
                    hours = sc.nextInt();
                    employees[i] = new HourlyEmployee(name, no, base, hours);
                    employees[i].computeSalary(); break;
            }// switch
            i++;
        } // while

        for (int j = 0; j < i; j++) {
            System.out.println(employees[j]);

        }
    }
}
