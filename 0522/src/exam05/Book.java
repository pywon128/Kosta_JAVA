package exam05;

public abstract class Book {
    protected String number;    // 관리번호
    protected String title;     // 제목
    protected String author;    // 저자

    public boolean equals(Object obj){
        boolean re = false;
        Book b = (Book) obj;
        if (number.equals(b.number)){
            re = true;
        }
        return re;
    }

    public Book(String number, String title, String author) {
        this.number = number;
        this.title = title;
        this.author = author;
    }
    public Book() {}

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void getLateFees(int days);


}
