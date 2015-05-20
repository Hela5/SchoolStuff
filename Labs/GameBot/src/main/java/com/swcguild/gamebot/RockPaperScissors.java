/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.gamebot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissors implements Game {
    @Override
    public  void run() {
        String stringUserVal = "", stringCompVal = "", stringNumRounds = "";
        int compVal = 0, userVal = 0, numRounds = 0, compWins = 0, userWins = 0, ties = 0;
        boolean playAgain = true;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while (playAgain) {
            playAgain = false;
            System.out.println("Welcome to Rock! Paper! Scissors!");
            
            do {
                System.out.println("How many rounds would you like to play today?");
                System.out.println("Minium rounds: 1, Maximum rounds: 10");
                stringNumRounds = sc.nextLine();
                numRounds = Integer.parseInt(stringNumRounds);
            } while (numRounds < 1 || numRounds > 10);
            
            for (int i = 1; i < numRounds + 1; i++) {
                userVal = displayMenu();

                compVal = rand.nextInt(3) + 1;
                System.out.println("Computer picks " + compVal + "\n");
    
                int winnerNum = checkWinner(userVal, compVal);
                    if (winnerNum == 2) {
                        ties++;
                    } else if (winnerNum == 1) {
                        userWins++;
                    } else if (winnerNum == 0) {
                        compWins++;
                    }
                
                System.out.println("   ");
            }
            checkWinStats (ties, userWins, compWins);
            
            System.out.println("\n Do you want to play again? Yes or No?");
            String stringPlayAgain = sc.nextLine();
            if (stringPlayAgain.equals("Yes")) {
                playAgain = true;
            } else if (stringPlayAgain.equals("No")) {
                playAgain = false;
            }
        }
    }

    public static int displayMenu() {
        Scanner sc = new Scanner(System.in);
        String stringUserVal = "";
        int userVal = 0;

        System.out.println("Please choose from the following: ");
        System.out.println("\t1 = Rock");
        System.out.println("\t2 = Paper");
        System.out.println("\t3 = Scissors");
        System.out.print("Choose your weapon! ");
        stringUserVal = sc.nextLine();

        userVal = Integer.parseInt(stringUserVal);
        return userVal;
    }

    
    
    public static int checkWinner(int userVal, int compVal) {
        int winnerType = 0;
        
        if (compVal == userVal) {
            System.out.println("It's a tie!");
            winnerType = 2;
        } else if (compVal == 1 && userVal == 2) {
            System.out.println("User wins! Paper wraps rock");
            winnerType = 1;
        } else if (compVal == 2 && userVal == 1) {
            System.out.println("Computer Wins! Paper wraps rock");
            winnerType = 0;
        } else if (compVal == 1 && userVal == 3) {
            System.out.println("Computer Wins! Rock smashes scissors");
            winnerType = 0;
        } else if (compVal == 3 && userVal == 1) {
            System.out.println("User Wins! Rock smashes scissors");
            winnerType = 1;
        } else if (compVal == 2 && userVal == 3) {
            System.out.println("User Wins! Scissors cut paper");
            winnerType = 1;
        } else if (compVal == 3 && userVal == 2) {
            System.out.println("Computer Wins! Scissors cut paper");
            winnerType = 0;
        }
        return winnerType;
    }
    
    
    public static void checkWinStats(int ties, int userWins, int compWins) {
        System.out.println("Number of ties = " + ties);
            System.out.println("Number of User Wins = " + userWins);
            System.out.println("Number of Computer Wins = " + compWins);
            if (userWins == compWins) {
                System.out.println("It's a tie!");
            } else if (userWins > compWins) {
                System.out.println("The User Beat the Computer!");
            } else {
                System.out.println("The Computer beat the User!");
            }
    }


    @Override
    public String getGameName() {
    return "Rock, Paper, Scissors";
    }
    
}
