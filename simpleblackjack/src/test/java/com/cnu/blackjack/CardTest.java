package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoRankException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CardTest {

    @Test
    public void 스페이드_10_카드를_생성할수있다(){
        Card card = new Card(1, Suit.CLOVER);
        int rank = card.getRank();
        Suit suit = card.getSuit();
        assertTrue(rank == 1);
        assertFalse(suit.equals("SPADE"));

    }

    @Test(expected = NoRankException.class)
    public void 카드의_랭크는_13_이하여야한다(){
        Card card = new Card(15, Suit.CLOVER);
    }
}
