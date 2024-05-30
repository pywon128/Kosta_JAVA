package exam05;

public class Customer extends Person{
    private int no;
    private int mileage;

    public Customer(String name, String addr, String phone, int no, int mileage) {
        super(name, addr, phone);
        this.no = no;
        this.mileage = mileage;
    }

    public Customer() {
        super();
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

//    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                ", addr='" + addr + '\'' +
//                ", phone='" + phone + '\'' +
//                ", no=" + no +
//                ", mileage=" + mileage +
//                '}';
//    }


    public String toString() {
        return "Customer{" +
                super.toString() +        // 부모클래스의 toString()을 호출함
                ", no=" + no +
                ", mileage=" + mileage +
                '}';
    }
}
