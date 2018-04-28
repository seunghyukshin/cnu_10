package com.cnu.blackjack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;

public class EvaluatorTest {

    Deck deck = new Deck(3);
    Game game = new Game (deck);
    Player player1;
    Evaluator evaluator;

    @Before
    public void setUp(){
        game.addPlayer("p1", 3000);

        Evaluator evaluator = new Evaluator(game.getPlayerList());
        player1 = game.getPlayerList().get("p1");
    }

    @Test
    public void 게임초기화시_모든플레이어는_2장의카드를_받는다() {

        Assert.assertTrue(player1.getHand().getCardList().size() == 2);
    }

    @Test
    public void 각_플레이어는_16이하면_히트한다() {

        evaluator.hitOrStay();

        assertThat(player1.getPlayerScore(), lessThan(27));
        assertThat(player1.getPlayerScore(), greaterThanOrEqualTo(17));
    }

    // not finished
    @Test
    public void 블랙잭이나오면_2배로_보상받고_해당_플레이어의_턴은_끝난다() {
        int value = (player1.getBalance() + player1.getCurrentBet()*4);

        // need p1's card set to 21
        evaluator.valueDistinction("p1");

        player1.setBalance(player1.getBalance() + player1.getCurrentBet()*4);
        Assert.assertEquals(player1.getPlayerScore(), value);
    }

    @Test
    public void 각_플레이어는_17이상이면_스테이한다() {

        evaluator.hitOrStay();

        assertThat(player1.getPlayerScore(), lessThan(27));
        assertThat(player1.getPlayerScore(), greaterThanOrEqualTo(17));

    }
}
