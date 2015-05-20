/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.countingdice;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class CountingDice {

    public static void main(String[] args) {

        int[] count = new int[12];
        Random r = new Random();
        int dice1 = 0;
        int dice2 = 0;

        for (int i = 0; i < 50; i++) {
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
            int sumDice = dice1 + dice2;
            count[sumDice - 1] += 1;
        }

        for (int i = 1; i < 12; i++) {
            String bar = "";
            for (int j = 0; j < count[i]; j++) {
                bar += "*";
            }
            System.out.println((i+1) + bar);
            
        }

    }
}
