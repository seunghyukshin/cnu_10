package com.cnu.blackjack;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dealer {

    private Hand hand;

    public Dealer(Deck deck){
        this.hand = new Hand(deck);
    }

    public Dealer(){
    }


    public int getDealerScore() {
        int score = 0;

        for (int i =0; i< hand.getCardList().size(); i++){
            if(hand.getCardList().get(i).getRank() > 10){
                score +=10;
            }else {
                score += hand.getCardList().get(i).getRank();
            }
        }

        System.out.println(score);
        return score;
    }

    public Card hitCard() {
        return hand.drawCard();
    }
}
