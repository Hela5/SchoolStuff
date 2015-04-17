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
public class LittleQuiz {

    public static void main(String[] args) {
        String green = "", oui = "";
        int five = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! Are you ready for a quiz?");
        System.out.println("Here it comes...");

        System.out.println("What color means go?");
        System.out.println("1) Red");
        System.out.println("2) Yellow");
        System.out.println("3) Green");
        green = sc.next();
        switch (green) {
            case "Red":
                System.out.println("Sorry, please don't get behind the wheel.");
                break;
            case "Yellow":
                System.out.println("Not so much, try again");
                break;
            case "Green":
                System.out.println("Yes! Great start.");
                break;
            default:
                System.out.println("Sorry, I don't understand.");
                break;
        }
        
        System.out.println("Next question:");
        System.out.println("What is 3 + 2?");
        System.out.println("1) 4");
        System.out.println("2) 5");
        System.out.println("3) 6");
        five = sc.nextInt();
        switch (five) {
            case 4:
                System.out.println("Close");
                break;
            case 5:
                System.out.println("Great choice!");
                break;
            case 6:
                System.out.println("Too far");
                break;
            default:
                System.out.println("Sorry, I still don't understand.");
                break;
        }
        
        System.out.println("One last question..");
        System.out.println("Are you still awake?");
        System.out.println("Yes or No");
        oui = sc.next();
        
        if ( oui == "Yes") {
            System.out.println("Thank goodness");
        } else {
            System.out.println("WAKE UP!");
        }
    }
    
}
