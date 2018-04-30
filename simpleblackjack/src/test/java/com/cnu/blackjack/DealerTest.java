package com.cnu.blackjack;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;

public class DealerTest {

    @Test
    public void 딜러는_17에서_26사이가_나온다() {
        Deck deck = new Deck(1);
        Dealer dealer = new Dealer(deck);

        int dealerScore = dealer.getDealerScore();

        while(dealerScore<=16){
            dealer.hitCard();
            dealerScore = dealer.getDealerScore();
        }

        assertThat(dealerScore, lessThan(27));
        assertThat(dealerScore, greaterThanOrEqualTo(17));
    }


}
