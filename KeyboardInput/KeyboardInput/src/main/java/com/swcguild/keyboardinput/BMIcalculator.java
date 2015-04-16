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
public class BMIcalculator {
    public static void main(String[] args) {
        float height = 0;
        float weight = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Your height in m:");
        height = keyboard.nextFloat();
        System.out.println("Your weight in kg:");
        weight = keyboard.nextFloat();
        
        float bmiCalc = weight / (height * height);
        
        System.out.println("Your BMI is " + bmiCalc);

    }
}
