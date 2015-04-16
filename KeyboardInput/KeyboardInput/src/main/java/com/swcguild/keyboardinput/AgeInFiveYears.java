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
public class AgeInFiveYears {

    public static void main(String[] args) {
        String name = "";
        int age = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextByte();

        int ageInFive = age + 5;
        int ageWithoutFive = age - 5;

        System.out.println("Did you know that in five years you will be " + ageInFive + " years old?");
        System.out.println("And five years ago you were " + ageWithoutFive + "! Imagine that!");
    }

}
