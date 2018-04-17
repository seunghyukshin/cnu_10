package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoMoreCardException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final int numberOfDeck;
    private final List<Card> cardList;


    public Deck(int numberOfDeck) {
        this.numberOfDeck = numberOfDeck;
        cardList = new ArrayList<Card>();
        createCard(numberOfDeck);
        Collections.shuffle(cardList);
    }
    //ctrl alt m
    private void createCard(int numberOfDeck) {
        for (int j = 0 ; j<numberOfDeck ; j++){
            for (int i =1 ; i< 14 ; i++){ //ACE, 숫자2 ... 에대해서 만든다
                for (Suit suit : Suit.values()) {
                    Card card = new Card(i, suit);
                    cardList.add(card);
               }
          }
        }
    }

    public int getTotalCardCount() {
        return cardList.size();
    }

    public Card drawCard() {
        if (cardList.size() ==0 ){
            throw new NoMoreCardException();
        }
       return cardList.remove(0);
    }
}
