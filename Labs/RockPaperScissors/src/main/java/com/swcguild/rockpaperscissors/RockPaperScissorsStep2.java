/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissorsStep2 {

    public static void main(String[] args) {
        String stringUserVal = "", stringCompVal = "", stringNumRounds = "";
        int compVal = 0, userVal = 0, numRounds = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Rock! Paper! Scissors!");
        do {
            System.out.println("How many rounds would you like to play today?");
            System.out.println("Minium rounds: 1, Maximum rounds: 10");
            stringNumRounds = sc.nextLine();
            numRounds = Integer.parseInt(stringNumRounds);
        } while (numRounds < 1 || numRounds > 10);
        for (int i = 1; i < numRounds + 1; i++) {
            System.out.println("Please choose from the following: ");
            System.out.println("\t1 = Rock");
            System.out.println("\t2 = Paper");
            System.out.println("\t3 = Scissors");
            System.out.print("Choose your weapon! ");
            stringUserVal = sc.nextLine();

            userVal = Integer.parseInt(stringUserVal);

            //for (int j = 0; j < 30; j++) {
            compVal = rand.nextInt(3) + 1;
            System.out.println(compVal);
            //}

            if (compVal == 1 && userVal == 1) {
                System.out.println("It's a tie!");
            }
            if (compVal == 2 && userVal == 2) {
                System.out.println("It's a tie!");
            }
            if (compVal == 3 && userVal == 3) {
                System.out.println("It's a tie!");
            }

            if (compVal == 1 && userVal == 2) {
                System.out.println("User wins! Paper wraps rock");
            }
            if (compVal == 2 && userVal == 1) {
                System.out.println("Computer Wins! Paper wraps rock");
            }
            if (compVal == 1 && userVal == 3) {
                System.out.println("Computer Wins! Rock smashes scissors");
            }
            if (compVal == 3 && userVal == 1) {
                System.out.println("User Wins! Rock smashes scissors");
            }
            if (compVal == 2 && userVal == 3) {
                System.out.println("User Wins! Scissors cut paper");
            }
            if (compVal == 3 && userVal == 2) {
                System.out.println("Computer Wins! Scissors cut paper");
            }
            if (userVal == 4) {
                System.out.println("Nuclear Option! Everyone loses!!");
            }
            System.out.println("   ");
        }
    }
}
