package com.cnu.blackjack;

import com.cnu.blackjack.Dealer;

import static org.junit.Assert.assertTrue;

public class DealerTest {
    public void 딜러는_17에서25사이의_점수를반환한다(){
        Dealer dealer = new Dealer();
        int score = dealer.getScore();
        assertTrue(score >16 && score< 25);
    }
}
