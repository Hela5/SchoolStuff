/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.factorizerweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apprentice
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class FactorizerController extends HttpServlet {

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
        String guestAnswer = request.getParameter("number");
        String numberFact = "";
        try {
            int number = Integer.parseInt(guestAnswer);
            numberFact = factor(number);

        } catch (Exception e) {
            numberFact = "Please enter valid number";
        }

        request.setAttribute("numberFact", numberFact);
        RequestDispatcher rd = request.getRequestDispatcher("response.jsp");
        rd.forward(request, response);
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

    public String factor(int num) {
        
        String factResponse = "";
        String factorsOf = "";
        String numFactors = "";
        String isPerfNum = "";
        String isPrimNum = "";
        String wholeResponse = "";

        int factor = 0, factorSum = 0;
        boolean isPrime = true;

//        System.out.print("What number would you like to Factorize today? ");
//        num = sc.nextInt();
        factResponse = "\nThe factors of " + num + " are: ";
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factorsOf = i + " = factor";
                factor = factor + 1;
                factorSum = factorSum + i;
            }
        }
        numFactors = "Number of factors = " + factor;

        if (factorSum == num) {
            isPerfNum = "Is a perfect number!";
        } else {
            isPerfNum = "Is not a perfect number!";
        }

        if (factor == 1) {
            isPrimNum = "Is a prime number!\n";
        } else {
            isPrimNum = "Is not a prime number!\n";
        }
        wholeResponse = factResponse + factorsOf + numFactors + isPerfNum + isPrimNum;
        return wholeResponse;
    }
}
