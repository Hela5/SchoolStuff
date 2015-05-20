/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arrays;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BasicArrays2 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            int randomNum = 0;
            randomNum = 1 + r.nextInt(100);
            System.out.println("Slot " + i + " contains a " + randomNum);
        }
    }
}
