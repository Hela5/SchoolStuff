/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.bankaccountmanager;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CheckingAccount extends Account {

    Scanner sc = new Scanner(System.in);

    public void deposit() {
        super.deposit();
    }

    public void withdraw() {
        super.withdraw();
        double newBalance = 0;
        if (deposit >= 10000) {
            System.out.println("Please wait for the money to fully transfer to your account and then be able to be withdrawn.");
        }
        do {
            System.out.println("How much would you like to withdraw?");
            double userWithdraw = sc.nextDouble();
            newBalance = balance - userWithdraw;
            if (newBalance < 0) {
                System.out.println("You've incurred a Fee!");
                double penalty = 10.0;
                newBalance = balance - penalty;
            }

        } while (newBalance >= -100);

    }

}
