/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.tipcalculator;

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
public class TipCalculatorController {

    @RequestMapping(value = "displayTipCalc", method = RequestMethod.GET)
    public String displayTipCalc(HttpServletRequest req, Model model) {
        return "displayTipCalc";
    }

    @RequestMapping(value = "submitTipCalc", method = RequestMethod.POST)
    public String submitTipCalc(HttpServletRequest req, Model model) {
        String guestBill = req.getParameter("dollarValue");
        double subTotal = Double.parseDouble(guestBill);
        String guestTip = req.getParameter("tipPercent");
        double toTip = Double.parseDouble(guestTip);

        try {

        } catch (Exception e) {

        }

        double tipPercent = toTip / 100;
        double tipTotal = subTotal * tipPercent;
        double grandTotal = subTotal + tipTotal;

        String billTotal = "Amount: $" + String.format("%.2f", subTotal) + "<br>Tip Percent: " + String.format("%.2f", tipPercent) + "<br>Tip Amount: $" + String.format("%.2f", tipTotal) + "<br>Total Amount: $" + String.format("%.2f", grandTotal);
        model.addAttribute("billTotal", billTotal);
        return "resultsTipCalc";
    }
}
