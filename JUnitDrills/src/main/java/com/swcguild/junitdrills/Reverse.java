/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.junitdrills;

/**
 *
 * @author apprentice
 */
public class Reverse {
//Given an array of ints length 3, return a new array with the elements in reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. 

    public int[] reverse(int[] numbers) {
        int[] temp;
        temp = new int[numbers.length];
        int j = 0;

        for (int i = numbers.length-1; i > 0; i--, j++) {
            temp[j] = numbers[i];
        }
        return temp;                                                                                                                                                                            
    }
}
