/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.keyboardinput;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        int heightFeet = 0;
        int heightInches = 0;
        double weight;
        
        System.out.print("How old are you?");
        age = keyboard.nextInt();
        
        System.out.println("How many feet tall are you?");
        heightFeet = keyboard.nextInt();
        
        System.out.println("And then how many inches after feet in height?");
        heightInches = keyboard.nextInt();
        
        System.out.println("How much do you weigh?");
        weight = keyboard.nextDouble();
        
        System.out.println("So you're " + age + " old, " + heightFeet + "'" + heightInches + "'' " + " tall and " + weight + " heavy." );
    }
}
