/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.interestcalculatorweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "InterestCalculatorController", urlPatterns = {"/InterestCalculatorController"})
public class InterestCalculatorController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) 
        String bankResponse = "";
        
        String guestRate = request.getParameter("percentRate");
        double percentRate = Double.parseDouble(guestRate);
        String guestPrincipal = request.getParameter("principal");
        double principal = Double.parseDouble(guestPrincipal);
        String guestYears = request.getParameter("years");
        int years = Integer.parseInt(guestYears);
        String guestInterest = request.getParameter("typeInterest");
//        double typeInterest = Double.parseDouble(guestInterest);
        
        try { 
            bankResponse = calculate(percentRate, principal, years, guestInterest);
        } catch (Exception e)
        {
            bankResponse = "Please re-enter data";
        }        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    public String calculate(double percentRate, double principal, int years, String typeInterest) {
//        Scanner sc = new Scanner(System.in);
        String bankResults = "";
        String stringInitAmt = "", stringInterestRate = "", stringNumYears = "", rateCompounding = "";
        double initialAmount = 0, interestRate = 0, origPrincipal = 0;
        double monthlyInterest = 0, quarterlyInterest = 0, dailyInterest = 0, annualInterestAmt = 0;
        int numYearsAccrued = 0, numYears = 0;

        System.out.println("Hi, welcome to your bank");

//        System.out.print("Enter the Annual Percentage Rate: ");
//        stringInterestRate = sc.nextLine();
        interestRate = percentRate;

//        System.out.print("Enter the Amount of Principal: ");
//        stringInitAmt = sc.nextLine();
        initialAmount = principal;

//        System.out.print("Enter the number of years that the money is to stay in the fund: ");
//        stringNumYears = sc.nextLine();
        numYears = years;
//
//        System.out.println("\nSelect the kind of compounding interest you would prefer: ");
//        System.out.println("Daily = \t'D'");
//        System.out.println("Monthly = \t'M'");
//        System.out.println("Quarterly = \t'Q'");
//        System.out.print("Please make your selection: ");
        rateCompounding = typeInterest;
        
      
        

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
        bankResults = "Year Number: \t\t\t\t" + numYearsAccrued + "\nPrincipal at the start of the year: \t" + initialAmount + "\nInterest at the end of the year: \t" + annualInterestAmt + "\nPrincipal at the end of the year: \t" + origPrincipal;
        return bankResults;
    
    }
    
    
}
