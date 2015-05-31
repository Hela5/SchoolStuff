/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.unitcoverter;

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
public class ConverterController {

    @RequestMapping(value = "displayConvt", method = RequestMethod.GET)
    public String displayConvt(HttpServletRequest req, Model model) {
        return "displayConvt";
    }
    
    @RequestMapping( value = "submitConvt", method= RequestMethod.POST)
    public String submitConvt(HttpServletRequest req, Model model) {
        String guestTemp = req.getParameter("temp");
        Double tempToCvt = Double.parseDouble(guestTemp);
        String guestMoney = req.getParameter("money");
        Double money = Double.parseDouble(guestMoney);
        String guestLength = req.getParameter("length");
        Double length = Double.parseDouble(guestLength);
        String guestWeight = req.getParameter("weight");
        Double weight = Double.parseDouble(guestWeight);
        
        
        if (tempToCvt)
        
        
        
        return "convtResults";
    }

}
