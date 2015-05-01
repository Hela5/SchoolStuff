/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.bankaccountmanager;

/**
 *
 * @author apprentice
 */
public class SavingsAccount extends Account {

    public void deposit() {
        super.deposit();
    }

    public void withdraw() {
        super.withdraw();
        double penalty = 10.0;
        System.out.println("You have incurred a penalty of " + penalty + "for withdrawing from your savings");
        double penaltyBalance = balance - penalty;
        System.out.println("New Balance: " + penaltyBalance);
    }

}
