package com.pluralsight.games;

import java.util.ArrayList;
import java.util.Scanner;

public class CardGame
{
    Scanner userInput = new Scanner(System.in);
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

        //select each player, and choose whether or not to hit or stay.
        boolean gameInProgress = true;

        while(gameInProgress) {
            System.out.println("Select the next player to play:");

            for (int i = 1; i < (players.size() + 1); i++) {
                System.out.println("Player " + i + ": " + players.get(i).getPlayerName());
            }
            int playerNumSelect = Integer.parseInt(userInput.nextLine());

            try {
                int currentValue = players.get(playerNumSelect).getValue();
                System.out.println(players.get(playerNumSelect).getPlayerName() + " currently has a value of " + currentValue);
            } catch (Exception e) {
                System.out.println("Player not found");
                continue;
            }

            int currentValue = players.get(playerNumSelect).getValue();
            if (currentValue < 21) {
                System.out.println("Do you want to Hit(H) or Stay(S)?");
                String currentAction = userInput.nextLine().toLowerCase();

                if (currentAction.equals("h")) {
                    players.get(playerNumSelect).deal(deck.deal());

                } else if (currentAction.equals("s")) {
                    System.out.println("Staying...");
                } else {
                    System.out.println("Skipping...");
                }
            }
            else if(currentValue == 21){
                System.out.println("This player currently has Blackjack!");
            }
            else{
                System.out.println("You've gone bust!");
            }


        }


        // loop and determine who won
        int currentWinningValue = 0;
        ArrayList<String> winners = new ArrayList<>();

        for(int i=0; i < players.size(); i++){

            int currentValue = players.get(i).getValue();

            System.out.println("Player " + i + ": " + players.get(i).getPlayerName() + " has a value of " + currentValue);
            if(currentValue <= 21){
                if(currentValue == 21 && currentWinningValue == 21){
                    winners.add(players.get(i).getPlayerName());
                }
                else if(currentValue == 21){
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
                    System.out.print(winners.get(i));
                }
                else{
                    System.out.print(winners.get(i) + " | ");
                }
            }
        }
    }
}
