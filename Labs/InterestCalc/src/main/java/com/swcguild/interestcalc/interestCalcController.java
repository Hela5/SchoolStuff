/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.interestcalc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class interestCalcController {

    @RequestMapping(value = "displayInterestC", method = RequestMethod.GET)
    public String displayInterestC(HttpServletRequest req, Model model) {
        return "displayInterestC";
    }

    @RequestMapping(value = "submitInterestC", method = RequestMethod.POST)
    public String submitInterestC(HttpServletRequest req, Model model) {

        String bankResponse = "";
        String bankResults = "";
        String errorMessage = "";

        String guestRate = req.getParameter("percentRate");
        double percentRate = Double.parseDouble(guestRate);
        String guestPrincipal = req.getParameter("principal");
        double principal = Double.parseDouble(guestPrincipal);
        String guestYears = req.getParameter("years");
        int years = Integer.parseInt(guestYears);
        String guestInterest = req.getParameter("typeInterest");
        String rateCompounding = guestInterest;

        try {
            bankResponse = bankResults;
        } catch (Exception e) {
            errorMessage = "Please re-enter data";
        }

        String stringInitAmt = "", stringInterestRate = "", stringNumYears = "";
        double initialAmount = 0.00, interestRate = 0.00, origPrincipal = 0.00;
        double monthlyInterest = 0.00, quarterlyInterest = 0.00, dailyInterest = 0.00, annualInterestAmt = 0.00;
        int numYearsAccrued = 0, numYears = 0;

        System.out.println("Hi, welcome to your bank");

        interestRate = percentRate;

        initialAmount = principal;

        numYears = years;
//
//        System.out.println("\nSelect the kind of compounding interest you would prefer: ");
//        System.out.println("Daily = \t'D'");
//        System.out.println("Monthly = \t'M'");
//        System.out.println("Quarterly = \t'Q'");
//        System.out.print("Please make your selection: ");
//        rateCompounding = typeInterest;

        if (rateCompounding.equalsIgnoreCase("daily")) {
            rateCompounding = "D";
        } else if (rateCompounding.equalsIgnoreCase("monthly")) {
            rateCompounding = "M";
        } else if (rateCompounding.equalsIgnoreCase("quarterly")) {
            rateCompounding = "Q";
        }

        origPrincipal = initialAmount;
        monthlyInterest = interestRate / 12;
        quarterlyInterest = interestRate / 4;
        dailyInterest = interestRate / 365;

        switch (rateCompounding) {
            case "D":
                for (int i = 1; i < (numYears + 1); i++) {
                    numYearsAccrued = i;
                    initialAmount = origPrincipal; //recycling initialAmount 
                    for (int j = 0; j < 365; j++) {
                        annualInterestAmt = annualInterestAmt + origPrincipal * (dailyInterest / 100);
                        origPrincipal = origPrincipal * (1 + (dailyInterest / 100));
                    }
                }
                break;
            case "M":
                for (int i = 1; i < (numYears + 1); i++) {
                    numYearsAccrued = i;
                    initialAmount = origPrincipal;
                    for (int j = 0; j < 12; j++) {
                        annualInterestAmt = annualInterestAmt + origPrincipal * (monthlyInterest / 100);
                        origPrincipal = origPrincipal * (1 + (monthlyInterest / 100));
                    }
                }
                break;

            case "Q":
                for (int i = 1; i < (numYears + 1); i++) {
                    numYearsAccrued = i;
                    initialAmount = origPrincipal;
                    for (int j = 0; j < 4; j++) {
                        annualInterestAmt = annualInterestAmt + origPrincipal * (quarterlyInterest / 100);
                        origPrincipal = origPrincipal * (1 + (quarterlyInterest / 100));
                    }
                }
                break;
            default:
                break;
        }
        bankResults = "<h1>Total Number of Years Invested:  " + numYearsAccrued + "</h1>"+ "<p>Principal at the start of the year: $" + String.format("%.2f", initialAmount) + "<br>Interest at the end of the year: $" + String.format("%.2f", annualInterestAmt) + "<br>Principal at the end of the year: $" + String.format("%.2f", origPrincipal);

        model.addAttribute("bankResults", bankResults);
        return "interestResults";

    }
}
