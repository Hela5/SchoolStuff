/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYou {

    public static void main(String[] args) {
        String name = "";
        int age = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hey, what's your name? ");
        name = sc.next();

        System.out.println("Ok, " + name + ", how old are you? ");
        age = sc.nextInt();

        if (age < 16) {
            System.out.println("You can't drive.");
        }

        if (age < 18) {
            System.out.println("You can't vote.");
        }

        if (age < 25) {
            System.out.println("You can't rent a car.");
        }

        if (age > 25) {
            System.out.println("You can do anything that's legal.");
        }
    }
}
