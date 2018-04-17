package com.cnu.blackjack;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlayerTest {
    Hand hand;

    @Test
    public void 플레이어는_시드머니를_가지고시작한다(){
        Player player = new Player(5000,hand);
        int balance = player.getBalance();
        assertTrue(balance==5000);
    }
    @Test
    public void 플레이어는_배팅을_할수있다(){

    }
}
