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
public class HowOldAreYouSpecifically {

    public static void main(String[] args) {
        int age = 0;
        String name = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = sc.next();
        System.out.print("Ok, " + name + ", how old are you? ");
        age = sc.nextInt();
        
        if ( age < 16 ) {
            System.out.println("You can't drive, " + name);
        } else if ( age < 17 ) {
            System.out.println("You can drive but not vote, " + name);
        } else if ( age < 24 ) {
            System.out.println("You can vote but not rent a car, "+ name) ;
        } else {
            System.out.println("You can do pretty much anything, " + name);
        }
    }   

}
