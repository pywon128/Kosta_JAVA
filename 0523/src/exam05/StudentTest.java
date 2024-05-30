package exam05;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student sd = new Student();

        ArrayList<Student> students = new ArrayList<Student>();
        int menu;

        while (true){
            System.out.println("1.추가 / 2.검색 / 3.삭제");
            System.out.print("선택 : ");
            menu = sc.nextInt();
            if (menu == 0){ break; }
            switch (menu){
                case 1: addInfo(students); break;
                case 2: printInfo(students); break;
                case 3: delInfo(students); break;
            }
        }
    }

    public static void printInfo(ArrayList<Student> students){
        String numb;
        System.out.print("전화번호 : ");
        numb = sc.next();
        for (Student student : students){
            System.out.println(student);
            System.out.println("student.getNumb : "+student.getNumb());
            System.out.println("numb : "+numb);
            if (student.getNumb().equals(numb)){
                System.out.println(student);
                return;
            }
        }
        System.out.println("찾고자 하는 학생의 정보는 없습니다.");
    }

    public static void delInfo(ArrayList<Student> students){
        String numb;
        System.out.print("전화번호 : ");
        numb = sc.next();
        for (Student student : students){
            if (student.getNumb().equals(numb)){
                System.out.println("student.getNumb : "+student.getNumb());
                System.out.println("numb : "+numb);
                Student.count -=1;
                students.remove(student);
                System.out.println("삭제되었습니다.");
                return;
            }
        }
        System.out.println("찾고자 하는 학생의 정보는 없습니다.");
    }

    public static void addInfo(ArrayList<Student> students){
        String name, addr, numb;

        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("주소 : ");
        addr = sc.next();
        System.out.print("전화번호 : ");
        numb = sc.next();
        students.add(new Student(name, addr, numb));
    }
}
