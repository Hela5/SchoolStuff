/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.whileloops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class KeepGuessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int compGuess = 0, userGuess = 0;
        
        compGuess = 1 + r.nextInt(10);

        System.out.println("I have chosen a number between 1 and 10.\nTry to guess it!");
        System.out.print("Your guess: ");
        userGuess = sc.nextInt();

        while (userGuess != compGuess) {
            System.out.println("That is incorrect. Guess again!");
            System.out.print("Your guess: ");
            userGuess = sc.nextInt();
        }
        if ( userGuess == compGuess) {
            System.out.println("\nYou're a good guesser!");
            System.out.println("I was thinking of " + compGuess);
        }
    }
}
