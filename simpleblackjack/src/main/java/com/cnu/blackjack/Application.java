package com.cnu.blackjack;

public class Application {
    Deck deck;
    Game game;
    Evaluator evaluator;


    private void setting(){
        // 덱 생성

        this.deck = new Deck(3);
        //게임
        this.game = new Game(deck);

        game.addPlayer("p1", 5000);
        game.addPlayer("p2", 5000);
        game.addPlayer("p3", 5000);

        this.evaluator = new Evaluator(game.getPlayerList());

    }
    public void start(){
        setting();




    }
}
