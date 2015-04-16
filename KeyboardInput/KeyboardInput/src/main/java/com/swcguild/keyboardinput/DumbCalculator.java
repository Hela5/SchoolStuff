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
public class DumbCalculator {
    public static void main(String[] args) {
        float firstNum = 0;
        float secondNum = 0;
        float thirdNum = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your first number?");
        firstNum = keyboard.nextFloat();
        System.out.println("What is your second number?");
        secondNum = keyboard.nextFloat();
        System.out.println("What is your third number?");
        thirdNum = keyboard.nextFloat();
        
        float numberSum = (firstNum + secondNum + thirdNum) / 2;
        System.out.println("Calculator result is: " + numberSum);
       
        
        
    }
}
