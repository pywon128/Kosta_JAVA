package exam05;

public class Student {
    private String name;
    private String addr;
    private String numb;

    public static int count=0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getNumb() {
        return numb;
    }
    public void setNumb(String numb) {
        this.numb = numb;
    }

    public Student(String name, String addr, String numb) {
        this.name = name;
        this.addr = addr;
        this.numb = numb;
        System.out.println("인원 : "+(++count));
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", numb='" + numb + '\'' +
                '}';
    }
}
