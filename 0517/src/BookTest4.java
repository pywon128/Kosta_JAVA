//class Book{
//    private String title;
//    private String author;
//
//    // 생성자
//    public Book(){
//        System.out.println("매개변수 없는 생성자");
//        title = "재미있는 자바";
//        author = "java";
//    }
//
//    public Book(String title, String author){
//        System.out.println("매개변수 있는 생성자");
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
//public class BookTest4 {
//    public static void main(String[] args) {
//        Book b1 = new Book();
//        Book b2 = new Book("신나는 자바", "java");
//
//        System.out.println(b1.getTitle());
//        System.out.println(b1.getAuthor());
//        System.out.println("----------------------");
//        System.out.println(b2.getTitle());
//        System.out.println(b2.getAuthor());
//    }
//}