/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculator {

    public void calculate() {
        Scanner sc = new Scanner(System.in);
        String stringInitAmt = "", stringInterestRate = "", stringNumYears = "", rateCompounding = "";
        double initialAmount = 0, interestRate = 0, principal = 0;
        double monthlyInterest = 0, quarterlyInterest = 0, dailyInterest = 0, annualInterestAmt = 0;
        int numYears = 0, numYearsAccrued = 0;

        System.out.println("Hi John, welcome to your bank");

        System.out.print("Enter the Annual Percentage Rate: ");
        stringInterestRate = sc.nextLine();
        interestRate = Double.parseDouble(stringInterestRate);

        System.out.print("Enter the Amount of Principal: ");
        stringInitAmt = sc.nextLine();
        initialAmount = Double.parseDouble(stringInitAmt);

        System.out.print("Enter the number of years that the money is to stay in the fund: ");
        stringNumYears = sc.nextLine();
        numYears = Integer.parseInt(stringNumYears);

        System.out.println("\nSelect the kind of compounding interest you would prefer: ");
        System.out.println("Daily = \t'D'");
        System.out.println("Monthly = \t'M'");
        System.out.println("Quarterly = \t'Q'");
        System.out.print("Please make your selection: ");
        rateCompounding = sc.nextLine();

        principal = initialAmount;
        monthlyInterest = interestRate / 12;
        quarterlyInterest = interestRate / 4;
        dailyInterest = interestRate / 365;

        switch (rateCompounding) {
            case "D":
                for (int i = 1; i < (numYears + 1); i++) {
                    numYearsAccrued = i;
                    initialAmount = principal; //recycling initialAmount 
                    for (int j = 0; j < 365; j++) {
                        annualInterestAmt = annualInterestAmt + principal * (dailyInterest / 100);
                        principal = principal * (1 + (dailyInterest / 100));
                    }
                }
                break;
            case "M":
                for (int i = 1; i < (numYears + 1); i++) {
                    numYearsAccrued = i;
                    initialAmount = principal;
                    for (int j = 0; j < 12; j++) {
                        annualInterestAmt = annualInterestAmt + principal * (monthlyInterest / 100);
                        principal = principal * (1 + (monthlyInterest / 100));
                    }
                }
                break;

            case "Q":
                for (int i = 1; i < (numYears + 1); i++) {
                    numYearsAccrued = i;
                    initialAmount = principal;
                    for (int j = 0; j < 4; j++) {
                        annualInterestAmt = annualInterestAmt + principal * (quarterlyInterest / 100);
                        principal = principal * (1 + (quarterlyInterest / 100));
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("Year Number: \t\t\t\t" + numYearsAccrued);
        System.out.println("Principal at the start of the year: \t" + initialAmount);
        System.out.println("Interest at the end of the year: \t" + annualInterestAmt);
        System.out.println("Principal at the end of the year: \t" + principal + "\n");
    }
}

