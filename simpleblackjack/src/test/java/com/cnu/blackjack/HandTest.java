package com.cnu.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HandTest {

    @Test
    public void 핸드는_카드를_한장씪받을수있따(){
        Hand hand = new Hand(new Deck(1));
        Card card = hand.drawCard();
        int size = hand.getCurrentHandSize();

        assertTrue(card != null);

    }

}
