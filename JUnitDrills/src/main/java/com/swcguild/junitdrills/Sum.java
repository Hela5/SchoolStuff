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
public class Sum {
//Given an array of ints, return the sum of all the elements. 
//Sum({1, 2, 3}) -> 6
//Sum({5, 11, 2}) -> 18
//Sum({7, 0, 0}) -> 7

    public int sum(int[] numbers) {
        int sumNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNums += numbers[i];

        }
        return sumNums;
    }
}
