//class Book{
//    private String title;
//    private String author;
//
//    // 생성자
//    // 생성자의 중복정의(생성자의 Overloading)
//    // -> 필요하다면 생성자를 중복하여 정의할 수 있음
//    // -> 중복 정의 조건 : 매개변수의 타입이나 개수를 다르게 하거나 순서를 다르게 해야 함
//    public Book(){
//        title = "제목없음";
//        author = "저자없음";
//    }
//
//    public Book(String title) {
//        this.title = title;
//        this.author = "?";
//    }
//
//    public Book(String title, String author){
//        this.title = title;
//        this.author = author;
//    }
//
//    public void setTitle(String title) { this.title = title; }
//    public void setAuthor(String author) { this.author = author; }
//    public String getTitle() { return title; }
//    public String getAuthor() { return author; }
//}
//
//public class BookTest6 {
//    public static void main(String[] args) {
//        Book b1 = new Book();
//        Book b2 = new Book("신나는 자바", "java");
//        Book b3 = new Book("재미있는 자바");
//
//        System.out.println(b1.getTitle());
//        System.out.println(b1.getAuthor());
//        System.out.println(b2.getTitle());
//        System.out.println(b2.getAuthor());
//        System.out.println(b3.getTitle());
//        System.out.println(b3.getAuthor());
//
//    }
//}