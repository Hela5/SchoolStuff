/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.lucky7;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class Lucky7Controller {

    @RequestMapping(value = "displayLucky7", method = RequestMethod.GET)
    public String displayLucky7(HttpServletRequest req, Model model) {
        return "displayLucky7";
    }

    @RequestMapping(value = "submitLucky7", method = RequestMethod.POST)
    public String submitLucky7(HttpServletRequest req, Model model) {
        int money = 0;
        String errorResponse = "";

        String guestAnswer = req.getParameter("money");
        String gameResponse = "";
        try {
            money = Integer.parseInt(guestAnswer);
//            gameResponse = getLucky(money);
        } catch (Exception e) {
            errorResponse = "Enter valid amount";
            return "displayLucky7";

        }
        int maxMoney = 0;
        int dice1 = 0;
        int dice2 = 0;
        int rolls = 1;
        int maxRolls = 1;
        Random rand = new Random();
        int rollSum = 0;

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

        gameResponse = "Whoops!<br>You are broke after " + (rolls - 1) + " rolls." + "<p>You probably should have quit after " + maxRolls + " rolls when you had " + " $" + maxMoney;

        model.addAttribute("gameResponse", gameResponse);
        return "Lucky7Results";
    }
}

//    public String getLucky(int money) {
//        int maxMoney = 0;
//        int dice1 = 0;
//        int dice2 = 0;
//        int rolls = 1;
//        int maxRolls = 1;
//        Random rand = new Random();
//        int rollSum = 0;
//
//        while (money > 0) {
//            dice1 = rand.nextInt(6) + 1;
//            dice2 = rand.nextInt(6) + 1;
//            rollSum = dice1 + dice2;
//
//            if (rollSum == 7) {
//                money = money + 4;
//                if (money > maxMoney) {
//                    maxMoney = money;
//                    maxRolls = rolls;
//                }
//            } else {
//                money = money - 1;
//            }
//            rolls = rolls + 1;
//        }
//
//        String gresponse = "You are broke after " + (rolls - 1) + " rolls." + "\nYou should have quit after " + maxRolls + " rolls when you had" + " $" + maxMoney;
//        return gresponse;
//    }
//}
