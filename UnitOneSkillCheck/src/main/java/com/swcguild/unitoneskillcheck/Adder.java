/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.unitoneskillcheck;

/**
 *
 * @author apprentice
 */
public class Adder {

    public static void main(String[] args) {
        int newSum = returnInt(1, 1);
        System.out.println(newSum);
        
        int secondSum = returnInt(2, 3);
        System.out.println(secondSum);
        
        int thirdSum = returnInt(5, 8);
        System.out.println(thirdSum);
        
        int fourthSum = returnInt(95, 42);
        System.out.println(fourthSum);
    }

    public static int returnInt(int one, int two) {
        int sum = one + two;
        return sum;
    }
;
}
