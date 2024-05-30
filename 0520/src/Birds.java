public class Birds {
    private String species;     // 새 종류
    private boolean fly;        // 날 수 있는지?
    private double bodySize, wingSize, beakSize;    // 몸 사이즈, 날개 사이즈, 부리 사이즈
    private double weight, height;      // 몸무게, 키
    private String habitat;     // 서식지
    private String beakShape;      // 부리모양

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public boolean isFly() {
        return fly;
    }
    public void setFly(boolean fly) {
        this.fly = fly;
    }
    public double getBodySize() {
        return bodySize;
    }
    public void setBodySize(double bodySize) {
        this.bodySize = bodySize;
    }
    public double getWingSize() {
        return wingSize;
    }
    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }
    public double getBeakSize() {
        return beakSize;
    }
    public void setBeakSize(double beakSize) {
        this.beakSize = beakSize;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getBeakShape() {
        return beakShape;
    }
    public void setBeakShape(String beakShape) {
        this.beakShape = beakShape;
    }

    public void canFly(){
        if (fly){
            System.out.println(species+"는 날 수 있습니다.");
        }else {
            System.out.println(species+"는 날 수 없습니다.");
        }
    }



    public void sleep(){
    }

    public void eat(){
    }


}
