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
public class Account {
    protected double balance;
    double deposit;
    
    public void withdraw() {
        
    }
    
    public void deposit() {
        double newBalance = balance + deposit;
        System.out.println("This is your current balance: " + balance);
        System.out.println("Your new balance is: " + newBalance);
    }
    
    public void checkBalance() {
        System.out.println(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
