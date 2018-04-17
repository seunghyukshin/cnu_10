package com.cnu.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class DeckTest {
    @Test
    public void 하나의덱은_총_52장의_카드를갖는다(){
        Deck deck =  new Deck(1);
        int totalCardCount = deck.getTotalCardCount();
        assertTrue(totalCardCount == 52);

    }
    @Test
    public void 세개의덱은_총_156장의_카드를갖는다(){
        Deck deck =  new Deck(3);
        int totalCardCount = deck.getTotalCardCount();
        assertTrue(totalCardCount == 156);

    }
    @Test
    public void 하나의_덱에서_카드한장을뽐으면_51장의_카드가_남아야한다(){
        Deck deck =new Deck(1);
        deck.drawCard();
        int totalCardCount = deck.getTotalCardCount();
        assertTrue(totalCardCount==51);
    }
    @Test
    public void 하나의_덱에서_모든카드를뽑으면_에러가발생한다(){
        Deck deck =new Deck(1);
        for(int i=0 ; i<51; i++){
            deck.drawCard();
        }

    }
}
