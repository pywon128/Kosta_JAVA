package movieGUI;

public class MovieVO {
    private String theaterName;
    private int reCount;
    private int total;


    public MovieVO(String theaterName, int reCount, int total) {
        this.theaterName = theaterName;
        this.reCount = reCount;
        this.total = total;
    }

    public String getTheaterName() {
        return theaterName;
    }
    public int getReCount() {
        return reCount;
    }
    public int getTotal() {
        return total;
    }
}