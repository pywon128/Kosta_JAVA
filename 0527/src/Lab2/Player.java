package Lab2;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Player {
    private String name;
    private Rule rule;
    private Integer playerHandRankings;     // player 의 족보를 숫자로 저장
    private List<Card> playerCards = new LinkedList<>();    // player 의 카드
    public Player(String name) { // 생성자
        this.name = name;
        rule = new Rule();              // 족보 판별을 위한 rule 객체 생성
    }
    public String getName() {
        return name;
    }   // name Getter

    public void setPlayerHandRankings() {
        this.playerHandRankings = rule.handRankings(getPlayerCards());
                                        // handRankings = Integer 반환 ( 매개변수 : List<Card> )
    }

    private Map<Integer, String> suit = new LinkedHashMap<>(){
        {
            put(1,"♠");
            put(2,"◆");
            put(3,"♥");
            put(4,"♣");
        }
    };
    private Map<Integer, String> number = new LinkedHashMap<>(){
        {
            put(2,"2");
            put(3,"3");
            put(4,"4");
            put(5,"5");
            put(6,"6");
            put(7,"7");
            put(8,"8");
            put(9,"9");
            put(10,"10");
            put(11,"J");
            put(12,"Q");
            put(13,"K");
            put(14,"A");
        }
    };
    private Map<Integer, String> handRankings = new LinkedHashMap<>(){
        {
            put(10, "Royal Flush");
            put(9, "Straight Flush");
            put(8, "Four of a Kind");
            put(7, "Full House");
            put(6, "Flush");
            put(5, "Straight");
            put(4, "Three of a Kind");
            put(3, "Two Pair");
            put(2, "One Pair");
            put(1, "High Card");
        }
    };

    public void addCard(Card card){
        this.playerCards.add(card);
    }

    public void delCard(int index){
        this.playerCards.remove(index-1);
    }

    public void showPlayerCards(){      // player가 가지고 있는 카드 출력
        for (Card card : playerCards){
            System.out.print("[ "+suit.get(card.getSuit())+" "+number.get(card.getNumber())+" ]");
        }
        System.out.println();
    }

    public void showPlayerHandRankings() {
        System.out.println(this.name+"의 HandRankings : "+handRankings.get(playerHandRankings));
        // 족보(HandRankings) Integer 값(Key)으로 HandRankings 문자열(Value) 출력
    }

    public List<Card> getPlayerCards() {
        return this.playerCards;
    }

    public Integer getPlayerHandRankings(){
        return this.playerHandRankings;
    }
}
