package exam05;

public class BookTest {
    public static void main(String[] args) {
        Book bN = new Novel("N1000","Nava", "Na" );
        Book bP = new Poet("P1000", "Pava", "Pa");
        Book bS = new ScienceFiction("S1000", "Sava","Sa");
        Book bS1 = new ScienceFiction("S1000", "Sava", "Sa");

        // 추상클래스의 객체는 생성할 수 없다
        // Book b = new Book();

        bN.getLateFees(10);
        bP.getLateFees(14);
        bS.getLateFees(12);
        System.out.println(bN);
        System.out.println(bP);
        System.out.println(bS);

        if (bS.equals(bS1)){
            System.out.println("같은 책");
        } else {
            System.out.println("다른 책");
        }


    }
}
