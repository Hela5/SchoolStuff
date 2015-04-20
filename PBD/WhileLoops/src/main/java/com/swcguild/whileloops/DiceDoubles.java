/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.whileloops;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class DiceDoubles {

    public static void main(String[] args) {
        Random r = new Random();
        int roll1 = 0, roll2 = 0, sumRolls = 0;

        System.out.println("HERE COMES THE DICE!\n");

        roll1 = 1 + r.nextInt(6);
        System.out.println("Roll #1: " + roll1);
        roll2 = 1 + r.nextInt(6);
        System.out.println("Roll #2: " + roll2);

        sumRolls = roll1 + roll2;
        System.out.println("The total is: " + sumRolls + "\n");

        while (roll1 != roll2) {
            roll1 = 1 + r.nextInt(6);
            System.out.println("Roll #1: " + roll1);
            roll2 = 1 + r.nextInt(6);
            System.out.println("Roll #2: " + roll2);

            sumRolls = roll1 + roll2;
            System.out.println("The total is: " + sumRolls + "\n");
        }
    }
}
