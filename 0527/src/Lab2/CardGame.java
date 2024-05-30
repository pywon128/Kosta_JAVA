package Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGame {
    private Scanner sc;
    private CardDeck cardDeck;
    private List<Player> players;

    public CardGame() {     // 생성자
        cardDeck = new CardDeck();      // 52장 포커카드 생성
        players = new ArrayList<>();    // 플레이어 생성
        sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {      // player 2명 생성
            players.add(new Player("Player "+i));
        }
    }

    private void cardDraw(){
        for (int i = 0; i < 4; i++) {
            for (Player player : players){
                player.addCard(cardDeck.delCard());
                // playerCards 에 Card 객체 담음
            }
        }
    }

    private void playGame(){
        int delCardIndex;

        cardDraw();     // 처음에 4장의 카드를 받음

        // 1장의 카드를 버림
        for (Player player : players){
            player.showPlayerCards();
            System.out.print(player.getName()+"의 몇 번째 카드를 버릴 건가요? ");
            delCardIndex = sc.nextInt();
            player.delCard(delCardIndex);
//            player.showPlayerCards();
        }
//        System.out.println(cardDeck.cardDeck.size());
        cardDraw(); // 4장의 카드를 받음

        for (Player player : players){
            player.setPlayerHandRankings(); // playerHandRankings 설정
            player.showPlayerHandRankings();
        }
        finishGame();
    }

    private void finishGame(){
        String result = players.getFirst().getName()+" 승리!";
        if (players.getFirst().getPlayerHandRankings() < players.getLast().getPlayerHandRankings()){
            result = players.getLast().getName()+" 승리!";
        }
        players.getFirst().showPlayerCards();
        players.getLast().showPlayerCards();
        System.out.println(result);
    }

    public static void main(String[] args) {
        CardGame cg = new CardGame();
        cg.playGame();
    }
}