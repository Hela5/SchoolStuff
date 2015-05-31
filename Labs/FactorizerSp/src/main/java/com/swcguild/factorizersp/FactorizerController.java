/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.factorizersp;

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
public class FactorizerController {

    @RequestMapping(value = "displayFact", method = RequestMethod.GET)
    public String displayFact(HttpServletRequest req, Model model) {
        return "displayFact";
    }

    @RequestMapping(value = "submitFact", method = RequestMethod.POST)
    public String submitFact(HttpServletRequest req, Model model) {
        String guestAnswer = req.getParameter("number");
        String numberFact = "";
        int number = 0;

        try {
            number = Integer.parseInt(guestAnswer);
        } catch (Exception e) {
            numberFact = "Please enter valid number";
            return numberFact + "displayFact";
        }

        String factResponse = "";
        String factorsOf = "";
        String numFactors = "";
        String isPerfNum = "";
        String isPrimNum = "";
        String wholeResponse = "";

        int factor = 0, factorSum = 0;
        boolean isPrime = true;

        factResponse = "\nThe factors of " + number + " are: ";
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorsOf = i + " = factor";
                factor = factor + 1;
                factorSum = factorSum + i;
            }
        }
        numFactors = "<br>Number of factors = " + factor;

        if (factorSum == number) {
            isPerfNum = "is a perfect number!";
        } else {
            isPerfNum = "is not a perfect number!";
        }

        if (factor == 1) {
            isPrimNum = "is a prime number!\n";
        } else {
            isPrimNum = "is not a prime number!\n";
        }

        wholeResponse = factResponse + factorsOf + numFactors + "<br>This number " + isPerfNum + "<br>This number " + isPrimNum;
  
        model.addAttribute("wholeResponse", wholeResponse);
        return "resultsFact";
    }

}
