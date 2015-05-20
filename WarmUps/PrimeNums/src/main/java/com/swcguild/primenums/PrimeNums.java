/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primenums;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PrimeNums {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        int num = keyboard.nextInt();

        boolean isPrime = true;

        for (int i = 1; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Number is prime.");
            }
        }
    }
}
    /**
     * int userNumber = 0; int primeNumber = 0; int mainNumber = 0; int
     * secondNumber = 0; boolean isPrime = false;
     *
     * Scanner keyboard = new Scanner(System.in);
     *
     * do { System.out.println("We are checking for Prime Numbers! Please pick a
     * random number"); userNumber = keyboard.nextInt(); } while (userNumber <=
     * 0);
     *
     * for (int i = 0; i <= userNumber; i++) { mainNumber = i;
     *
     * for (int z = 1; z <= userNumber; z++) { secondNumber = z; //if
     * (mainNumber % secondNumber == 0) { // System.out.println(i + " " + z);
     * //} if (mainNumber % secondNumber == 0) { z++;
     *
     * }
     * }
     * }
     * }
     * }
     *
     */
