package exam06;
abstract class Book{
//    public abstract int getLateFees(int days);
    public void pro(){}
}

class Novel extends Book{
    public int getLateFees(int days) {
        return days*300;
    }
}

class Poet extends Book{
    public int getLateFees(int days){
        return days*200;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Novel();
        Book b2 = new Poet();
        b1.pro();
        b2.pro();
        ((Novel)b1).getLateFees(1);
        ((Novel)b2).getLateFees(1);
    }
}
