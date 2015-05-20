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
public class Make2 {
//Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. 
//Make2({4, 5}, {1, 2, 3}) -> {4, 5}
//Make2({4}, {1, 2, 3}) -> {4, 1}
//Make2({}, {1, 2}) -> {1, 2}

    public int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];
        int i = 0;

        for (i = 0; i < a.length; i++) {
            if (i >= 2) {
                break;
            }
            newArray[i] = a[i];
        }

        for (int j = 0; j < b.length; j++, i++) {
            if (i >= 2) {
                break;
            }
            newArray[i] = b[j];
        }
        return newArray;

    } 

}
