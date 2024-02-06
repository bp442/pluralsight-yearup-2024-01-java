package com.pluralsight.games;

import java.util.ArrayList;

public class CardGame
{
    private ArrayList<Hand> players = new ArrayList<>();
    private Deck deck = new Deck();



    public void start()
    {
        deck.shuffle();

        // start by adding a few players
        players.add(new Hand("Daisy"));
        players.add(new Hand("Tee"));
        players.add(new Hand("Gabe"));

        // loop and deal the cards
        for(int y=0; y < 2; y++) { //two cards for each person
            for (Hand player : players) {
                player.deal(deck.deal());
            }
        }

        // loop and determine who won
        int currentWinningValue = 0;
        ArrayList<String> winners = new ArrayList<>();

        for(int i=0; i < players.size(); i++){

            int currentValue = players.get(i).getValue();

            System.out.println("Player: " + players.get(i).getPlayerName() + " has a value of " + currentValue);
            if(currentValue <= 21){
                if(currentValue == 21 && currentWinningValue == 21){
                    winners.add(players.get(i).getPlayerName());
                }
                else if(currentValue == 21 && currentWinningValue != 21){
                    winners.clear();
                    winners.add(players.get(i).getPlayerName());
                    currentWinningValue = 21;
                }
                else{
                    if(currentValue > currentWinningValue) {
                        winners.clear();
                        winners.add(players.get(i).getPlayerName());
                        currentWinningValue = currentValue;
                    }
                    else if(currentValue == currentWinningValue){
                        winners.add(players.get(i).getPlayerName());
                    }
                }
            }
        }

        // display the winner
        if(winners.size() == 1){
            System.out.println("The winner is " + winners.getFirst());
        }
        else if(winners.size() > 1){
            System.out.println("Tie between: ");

            for(int i = 0; i < winners.size(); i++){
                if(i == winners.size()-1){
                    System.out.print(" " + winners.get(i));
                }
                else{
                    System.out.print(" " + winners.get(i) + " |");
                }
            }
        }
    }
}
