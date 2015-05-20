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
public class AgeMessages3 {

    public static void main(String[] args) {
        int age = 0;
        String name = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        name = sc.next();
        
        System.out.println("How old are you? ");
        age = sc.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive, " + name);
        }
        
        if (age <= 17 ) {
            System.out.println("You can drive but you can't vote, " + name);
        }
        
        if (age > 18 && age < 24 ) {
            System.out.println("You can vote but not rent a car, " + name);
        }
        
        if (age > 25) {
            System.out.println("You can do pretty much anything, " + name);
        }
    }
}
