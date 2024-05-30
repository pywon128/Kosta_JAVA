package exam06;

public class Book {
    protected String title;
    protected int page;
    protected String author;

    public Book(String title, int page, String author) {
        this.title = title;
        this.page = page;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", author='" + author + '\'' +
                '}';
    }
}
