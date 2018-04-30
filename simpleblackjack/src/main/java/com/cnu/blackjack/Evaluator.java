package com.cnu.blackjack;

import java.util.Map;

public class Evaluator {

    private Map<String, Player> playerMap;
    private Dealer dealer;

    public Evaluator(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
        dealer = new Dealer();
        dealCardToPlayers();
    }

    public void start() {

    }

    private void dealCardToPlayers() {
        playerMap.forEach((name, player) -> {
            player.hitCard();
            player.hitCard();
        });
    }

    public void hitOrStay(){

        playerMap.forEach((name, player) -> {
        while(player.getPlayerScore() <= 16){
            player.hitCard();
        }
        });
    }

    public void valueDistinction(String name){
        Player player = playerMap.get(name);
        int PS = player.getPlayerScore();
        int DS = dealer.getDealerScore();
        if(PS == 21){
            player.setBalance(player.getBalance() + (player.getCurrentBet() * 4));
            System.out.println("BlackJack");
        } else if(PS>21 && DS > 21){
            if(PS > DS){
                lose(name);
            } else{
                win(name);
            }
        } else if(PS<21 && DS > 21){
            win(name);
        } else if (PS>21 && DS < 21){
            lose(name);
        } else {
            if(PS > DS){
                win(name);
            } else{
                lose(name);
            }
        }
    }

    private void win(String name){
        Player player = playerMap.get(name);
        player.setBalance(player.getBalance() + (player.getCurrentBet() * 2));
        System.out.println("Player Win");
    }

    private void lose(String name){
        Player player = playerMap.get(name);
        player.setBalance(player.getBalance());
        System.out.println("Player Lose");
    }
    //

}
