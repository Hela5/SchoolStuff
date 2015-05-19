/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.forloops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ProjectBlackJack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int compCard1 = 0, compCard2 = 0, newUserSum = 0, newCompSum = 0, sumCompCards = 0;
        int compCard3 = 0, userCard3 = 0;
        boolean kickOut = false;

        System.out.println("Welcome to Andria's BlackJack Program!");
        int userCard1 = 1 + r.nextInt(11);
        int userCard2 = 1 + r.nextInt(11);
        System.out.println("You get a " + userCard1 + " and a " + userCard2 + ". ");
        int sumUserCards = userCard1 + userCard2;
        System.out.println("Your total is " + sumUserCards + ". ");

        if (sumUserCards == 21) {
            System.out.println("Winner, winner!");
        } else if (sumUserCards < 21) {
            compCard1 = 1 + r.nextInt(11);
            compCard2 = 1 + r.nextInt(11);
            System.out.println("\nThe dealer has a " + compCard1 + " showing and a hidden card.");
            System.out.println("His total is hidden too.");
            sumCompCards = compCard1 + compCard2;
        } else {
            System.out.println("Too high. Dealer wins!");
        }

        do {
            System.out.println("\nWould you like to 'hit' or 'stay'?");
            String userResponse = sc.next();
            if (userResponse.equals("hit")) {
                userCard3 = 1 + r.nextInt(11);
                System.out.println("You get a card " + userCard3 + ".");
                newUserSum = sumUserCards + userCard3;
                sumUserCards = newUserSum;
                System.out.println("You now have " + newUserSum + ".");
                if (newUserSum > 21) {
                    System.out.println("Oops, too high. Dealer Wins.");
                } else if (newUserSum == 21) {
                    System.out.println("Winner, Winner!");
                }
            } else {
                System.out.println("\nDealer's turn.");
                System.out.println("Dealer's hidden card was a " + compCard2 + ".\nTheir total was " + sumCompCards);
                if (sumCompCards < 21) {
                    System.out.println("\nDealer chooses to hit.");
                    compCard3 = 1 + r.nextInt(11);
                    System.out.println("Dealer gets a card " + compCard3 + ".");
                    newCompSum = sumCompCards + compCard3;
                    sumCompCards = newCompSum;
                    System.out.println("Dealer now has " + newCompSum + ".");
                    if (newCompSum > 21) {
                        System.out.println("Oops, too high. You Win!");
                    } else if (newCompSum == 21) {
                        System.out.println("Comp Wins!!");
                    } else {
                        kickOut = true;
                    }
                }
            }
        } while (newUserSum < 21 && newCompSum < 21);
    }
}
