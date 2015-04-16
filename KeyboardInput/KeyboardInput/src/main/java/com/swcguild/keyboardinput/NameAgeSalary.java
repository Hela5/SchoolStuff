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
public class NameAgeSalary {

    public static void main(String[] args) {
        String name = "";
        int age = 0;
        float salary = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        name = keyboard.nextLine();

        System.out.println("Hi " + name + "!" + " How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        salary = keyboard.nextFloat();
        
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}