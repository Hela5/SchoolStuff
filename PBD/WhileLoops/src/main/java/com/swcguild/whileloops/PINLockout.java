/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.whileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PINLockout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 12345, tries = 0;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.println("ENTER YOUR PIN: ");
        int entry = sc.nextInt();
        tries++;

        while (entry != pin && tries < 4) {
            System.out.println("\nIncorrect pin. Try again.");
            System.out.println("ENTER YOUR PIN: ");
            entry = sc.nextInt();
            tries++;
        }

        if (entry == pin) {
            System.out.println("Pin ACCEPTED. Now you have accesss to your account.");
        } else if (tries >= 4) {
            System.out.println("You have run out of tries. Account locked!");
        }
    }
}
