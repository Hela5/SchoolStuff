/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.factorizer;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class factorizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, factor = 0, factorSum = 0;
        boolean isPrime = true;

        System.out.print("What number would you like to Factorize today? ");
        num = sc.nextInt();
        System.out.println("\nThe factors of " + num + " are: ");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i + " = factor");
                factor = factor + 1;
//                if (i > 1) {
//                    isPrime = false;
//                }
                factorSum = factorSum + i;
            }
        }
        System.out.println("Number of factors = " + factor);

        if (factorSum == num) {
            System.out.println("Is a perfect number!");
        } else {
            System.out.println("Is not a perfect number!");
        }

        if (factor == 1) {
            System.out.print("Is a prime number!\n");
        } else {
            System.out.println("Is not a prime number!\n");
        }

    }
}
