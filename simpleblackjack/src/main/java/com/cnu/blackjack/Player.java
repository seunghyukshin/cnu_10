package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NotEnoughBalanceException;
import lombok.Data;

@Data
public class Player {

    private int balance;
    private int currentBet;
    private Hand hand;

    public Player(int seedMoney, Hand hand) {
        this.balance = seedMoney;
        this.hand = hand;
    }

    public void placeBet(int bet) {
        if(balance < bet) {
            throw new NotEnoughBalanceException();
        }
        balance -= bet;
        currentBet = bet;
    }

    // 플레이어의 카드 숫자 합
    public int getPlayerScore() {
        int score = 0;

        for (int i =0; i< hand.getCardList().size(); i++){
            if(hand.getCardList().get(i).getRank() > 10){
                score +=10;
            }else {
                score += hand.getCardList().get(i).getRank();
            }
        }

        System.out.println(score);
        return score;
    }

    public Card hitCard() {
        return hand.drawCard();
    }
}
