public class Plane {
    private String company;
    private String model;
    private int passengers;

    public static int planes;
    public static int getPlanes(){
        return planes;
    }

    // getter & setter
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    //생성자 매개변수 O
    public Plane(String company, String model, int passengers) {
        this.company = company;
        this.model = model;
        this.passengers = passengers;
        planes++;
    }
    //생성자 매개변수 X
    public Plane() {
        this("모름","모름",0);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
