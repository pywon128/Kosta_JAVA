package Lab2;

public class Card {
    private int suit;
    private int number;


    // 생성자
    public Card(int suit, int number){
        this.suit = suit;
        this.number = number;
    }

    // Getter
    public int getSuit() {
        return suit;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return  "suit='" + suit + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
