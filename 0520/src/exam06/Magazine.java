package exam06;

public class Magazine extends Book{
    private String releaseDate;

    public Magazine() {
    }

    public Magazine(String title, int page, String author, String releaseDate) {
        super(title, page, author);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                super.toString()+
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
