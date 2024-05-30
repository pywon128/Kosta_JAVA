package Lab2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cardDeck = new LinkedList<>();
    // 52장의 포커 카드가 담길 LinkedList

    public CardDeck(){      // 카드뭉치를 생성하는 생성자
        int[] suit = {1,2,3,4}; // 1.Spades, 2.Diamonds, 3.Hearts 4.Clubs
        int[] number = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        // 2~10 숫자, 11.Jack, 12.Queen, 13.King, 14.Ace

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < number.length; j++) {
                cardDeck.add(new Card(suit[i], number[j]));
            }
        }
        shuffle();
    }

    public void shuffle(){              // 카드 셔플
        Collections.shuffle(cardDeck);
    }

    public Card delCard(){              // 카드를 뽑을 때 마다 삭제
        return cardDeck.removeFirst();
    }

}
