package com.cnu.blackjack;

import lombok.Data;

@Data
public class Player {
    private int currentBet ;
    private int balance;
    private Hand hand;

    public Player(int money,Hand hand) {
        this.balance = money;
        this.hand=hand;
    }
    public void placeBet(int bet){
        if(balance<bet){
         //   throw new
        }
        balance -= bet;
        currentBet = bet;
    }
    public Card hitCard(){
        return hand.drawCard();
    }

}
