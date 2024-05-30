package exam10;

public class Student extends Human{

    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
        System.out.println("Student 생성자");
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return "Student : "+super.toString()+", "+major;
    }

    @Override
    public String getProfession() {
        return major;
    }

    public static void main(String[] args) {
        Student s1 = new Student("명진", 21, "컴퓨터");
        Student s2 = new Student("미현", 22, "경영");
        Student s3 = new Student("용준", 24, "경제");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.getProfession());
        System.out.println(s2.getProfession());
        System.out.println(s3.getProfession());

    }


}
