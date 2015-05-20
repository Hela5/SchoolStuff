/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.gamebot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Lucky7s implements Game {
    @Override
    public void run() {
        int money = 0;
        int maxMoney = 0;
        int dice1 = 0;
        int dice2 = 0;
        int rolls = 1;
        int maxRolls = 1;
        Random rand = new Random();
        int rollSum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How much would you like to play with?");
        money = sc.nextInt();
        //maxMoney = money;

        while (money > 0) {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            rollSum = dice1 + dice2;

            if (rollSum == 7) {
                money = money + 4;
                if (money > maxMoney) {
                    maxMoney = money;
                    maxRolls = rolls;
                }
            } else {
                money = money - 1;
            }
            rolls = rolls + 1;
        }

        System.out.println(
                "You are broke after " + (rolls - 1) + " rolls.");
        System.out.println(
                "You should have quit after " + maxRolls + " rolls when you had" + " $" + maxMoney);
    }

 
    @Override
    public String getGameName() {
     return "Lucky 7's";
    }

}
