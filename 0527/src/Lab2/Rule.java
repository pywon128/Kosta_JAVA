package Lab2;

import java.util.*;

public class Rule {
    public Integer handRankings(List<Card> cards){
        int[] overlap = new int[13];
        int[] flush = new int[4];
        Set<Integer> treeSetStraight = new TreeSet<>();     // 중복제거를 위해 TreeSet 사용

        int isStraight=0;
        boolean isFlush = false;
        boolean isFourOfAKind = false;
        boolean isThreeOfAKind = false;
        int pair = 0;
        boolean isPair = false;

        for (Card card : cards){      // 중복 문양과 중복 숫자, 연속된 숫자 판별하기 위한 for 문
            int s = card.getSuit();
            int n = card.getNumber();
            flush[s-1] += 1;
            overlap[n-2] += 1;
            treeSetStraight.add(card.getNumber());
        }

        for (int f : flush){        // 같은 문양 5개가 있으면 isFlush = true
            if (f == 5) {
                isFlush = true;
                break;
            }
        }

        for (int o : overlap){      // 문양 상관없이 중복된 숫자 판별
            if (o == 4){ isFourOfAKind = true; }
            if (o == 3){ isThreeOfAKind = true;
            } else if (o >= 2) {
                pair += 1;
                isPair = true;
            }
        }
        List<Integer> straight = new ArrayList<>(treeSetStraight);
        // straight 를 판별하기 위해 ArrayList 에 담음

//        System.out.println("flush = " + Arrays.toString(flush));
//        System.out.println("straight = " + straight);

        for (int i = 0; i < straight.size()-1; i++) {
            if (straight.get(i)-straight.get(i+1) != -1){
                isStraight = 0;
            }
            isStraight += 1;
            if (isStraight == 5){ break; }
        }
//        System.out.println("isFlush = " + isFlush);
//        System.out.println("isStraight = " + isStraight);

        if (isFlush && straight.contains(10) && straight.contains(11) && straight.contains(12) &&
                straight.contains(13) && straight.contains(14)){ return 10; }   // 10, "Royal Flush"
        if (isFlush && isStraight == 5) { return 9; }   // 9, "Straight Flush"
        if (isFourOfAKind) { return 8; }    // 8, "Four of a Kind"
        if (isThreeOfAKind && isPair) { return 7; }     // 7, "Full House"
        if (isFlush) { return 6; }          // 6, "Flush"
        if (isStraight == 5) { return 5; }  // 5, "Straight"
        if (isThreeOfAKind) { return 4; }   // 4, "Three of a Kind"
        if (pair >= 2) { return 3; }        // 3, "Two Pair"
        if (isPair) { return 2; }           // 2, "One Pair"
        return 1;   // 1, "High Card"
    }
}