package com.cnu.blackjack;

import com.cnu.blackjack.exceptions.NoRankException;
import lombok.Data;

@Data
//getter setter 굳이 안써줘도된다.
public class Card {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit){
        if(rank >13){
            new NoRankException();
        }
        this.rank=rank;
        this.suit=suit;

    }


}

