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
public class CountingWithAWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times!");
        System.out.println("Message: ");
        String message = sc.nextLine();

        int n = 0;
        while (n < 5) {
            System.out.println((n + 1) + ". " + message);
            n++;
        }
    }
}
