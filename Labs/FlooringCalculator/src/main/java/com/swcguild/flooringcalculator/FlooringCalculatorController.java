/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringcalculator;

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
public class FlooringCalculatorController {

    @RequestMapping(value = "displayFlooring", method = RequestMethod.GET)
    public String displayFlooring(HttpServletRequest req, Model model) {
        return "displayFlooring";
    }

    @RequestMapping(value = "submitFlooring", method = RequestMethod.POST)
    public String submitFlooring(HttpServletRequest req, Model model) {
        String flooringArea = "";
        String flooringResults = "";
        String errorMessage = "";
        double areaCovered = 0;
        double fullCost = 0;
        double width = 0;
        double length = 0;
        double costPSF =0;
        
        try {
            String guestWidth = req.getParameter("width");
            width = Double.parseDouble(guestWidth);
            String guestLength = req.getParameter("length");
            length = Double.parseDouble(guestLength);
            String guestCPSF = req.getParameter("costPSF");
            costPSF = Double.parseDouble(guestCPSF);

            flooringArea = flooringResults;
            
        } catch (Exception e) {
            errorMessage = "Please re-enter your data";
            return "displayFlooring";
        }

        areaCovered = (width * length) * costPSF;
        fullCost = (areaCovered / 5) * 21.5;
        
        flooringResults = "The total area covered will be: " + String.format("%.2f", areaCovered) + " sq ft" + "<p>Flooring Materials Cost plus Labor Costs: $" + String.format("%.2f", fullCost) + "</p>";

        model.addAttribute("flooringResults", flooringResults);

        return "flooringResults";

    }
}
