//import java.util.Scanner;
//
//class Student{
//    String name;
//    int kor, eng, math, tot;
//    double avg;
//}
//
//public class D08StudentClassTest {
//    public static void main(String[] args){
//        Student[] data = new Student[5];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < data.length; i++) {
//            data[i] = new Student();
//            System.out.printf("%d번 학생의 이름 : ",i+1);
//            data[i].name = sc.next();
//            System.out.print("국어 점수 : ");
//            data[i].kor = sc.nextInt();
//            System.out.print("영어 점수 : ");
//            data[i].eng = sc.nextInt();
//            System.out.print("수학 점수 : ");
//            data[i].math = sc.nextInt();
//
//            data[i].tot = data[i].kor + data[i].eng + data[i].math;
//            data[i].avg = data[i].tot/3.0;
//        }
//
//        for (Student stud : data){
//            System.out.println(stud.name+"\t"+stud.kor+"\t"+stud.eng +"\t"
//                    +stud.math+"\t"+ stud.tot+"\t"+ stud.avg);
//        }
//
//
//
//    }
//}
