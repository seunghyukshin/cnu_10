package com.cnu.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private Deck deck;
    private List<Card> handList;
    public Hand(Deck deck){
        this.deck =deck;
        handList = new ArrayList<Card>();
    }
    public Card drawCard() {
        Card card = deck.drawCard();
        handList.add(card);
        return card;
    }

    public int getCurrentHandSize() {
        return handList.size();
    }
    public List<Card> getCardList(){
        return handList;
    }
}
