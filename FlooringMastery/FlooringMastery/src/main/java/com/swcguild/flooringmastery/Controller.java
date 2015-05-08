/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Controller {

    ConsoleIO cons = new ConsoleIO();
    Order order = new Order();
    boolean keepRunning = true;
    OrderDAO orderD = new OrderDAO();
    Factory fact = new Factory();
    private String currentDate;

    public void run() {

        try {
            orderD.loadConfig();
            
        } catch (FileNotFoundException ex) {
            cons.displayUserString(ex.getMessage());
        }

//loads Taxes.txt (tax file)        
        TaxDAOFileImpl f = new TaxDAOFileImpl();
        try {
            f.loadTaxInfo();
        } catch (FileNotFoundException ex) {
            cons.displayUserString(ex.getMessage());
        }

//loads Product.txt (product file)
        ProductDAOFileImpl p = new ProductDAOFileImpl();
        try {
            p.loadProductInfo();
        } catch (FileNotFoundException ex) {
            cons.displayUserString(ex.getMessage());
        }

        currentDate = cons.queryUserString("Please enter the date in the format of: MMDDYYYY");
        try {
            orderD.loadOrdersList(currentDate);
        } catch (FileNotFoundException e) {
            cons.displayUserString(e.getMessage());
        }
        do {
            displayMenu();
            int userChoice = cons.queryUserInt("Please choose from the listed options above. ");
            switch (userChoice) {
                case 1:

                    cons.displayUserString("Let's find your order...");
                    displayOrders();
                    break;
                case 2:
                    cons.displayUserString("Let's add an order...");
                    addOrder();

                    break;
                case 3:

                    break;
                case 4:
                    cons.displayUserString("Let's remove an order...");
                    removeOrder();
                    break;
                case 5:
                    if (orderD.isCanSave()==false) {
                    cons.displayUserString("Config mode: can't save.");
                    
                    break;} 
                    try {
                        orderD.writeOrdersList(currentDate);
                    } catch (IOException ex) {
                        cons.displayUserString(ex.getMessage());
                    }
                    break;
                case 6:
                    cons.displayUserString("Thank you for your business today.");
                    keepRunning = false;
                    break;
//                case 7:
//                    try {
//                        orderD.loadOrdersList();
//                    } catch (FileNotFoundException ex) {
//                        cons.displayUserString(ex.getMessage());
//                    }
//                    break;
                default:
                    cons.displayUserString("Sorry, not a valid option.\nTry again.");
            }

        } while (keepRunning);

    }

    private void displayMenu() {
        cons.displayUserString("***********************************************");
        cons.displayUserString("*              Flooring Program                ");
        cons.displayUserString("*                                              ");
        cons.displayUserString("* 1. Display Orders                            ");
        cons.displayUserString("* 2. Add an Order                              ");
        cons.displayUserString("* 3. Edit an Order                             ");
        cons.displayUserString("* 4. Remove an Order                           ");
        cons.displayUserString("* 5. Save Current Work                         ");
        cons.displayUserString("* 6. Quit                                      ");
        cons.displayUserString("*                                              ");
        cons.displayUserString("***********************************************");

    }

    private void displayOrders() {
        String searchDate = cons.queryUserString("Enter date of invoice you're searching for: ");
        try {
            orderD.loadOrdersList(searchDate);
        } catch (FileNotFoundException e) {
            cons.displayUserString(e.getMessage());
        }
        ArrayList<Order> allOrders = orderD.displayOrders();

        for (Order currentOrder : allOrders) {
            cons.displayUserString("Order ID: " + currentOrder.getOrderNum());
            cons.displayUserString("Name: " + currentOrder.getCustomerFirstName() + " " + currentOrder.getCustomerLastName());
            cons.displayUserString("State: " + currentOrder.getState());
            cons.displayUserString("Tax Rate: " + currentOrder.getTaxRate());
            cons.displayUserString("Product Type: " + currentOrder.getProductType());
            cons.displayUserString("Area covered: " + currentOrder.getArea());
            cons.displayUserString("Cost per Square Foot: " + currentOrder.getCostPSF());
            cons.displayUserString("Labor Cost per Square Foot: " + currentOrder.getLaborCostPSF());
            cons.displayUserString("Material Cost: " + currentOrder.getMaterialCost());
            cons.displayUserString("Labor Cost: " + currentOrder.getLaborCost());
            cons.displayUserString("Tax: " + currentOrder.getTax());
            cons.displayUserString("Total: " + currentOrder.getTotal() + "\n");

        }
    }

    private void addOrder() {
        String firstName = cons.queryUserString("Please enter the first name of the customer: ");
        String lastName = cons.queryUserString("Please enter the last name of the customer: ");
        String state = cons.queryUserString("Enter the state of residence: ");
        state = state.toUpperCase();

        String productType = cons.queryUserString("Enter product type desired: ");
        productType = productType.toUpperCase();
        double area = cons.queryUserDouble("Enter area to be covered: ");

        orderD.addOrder(fact.createOrder(firstName, lastName, area, productType, state));
    }

    private void removeOrder() {
        displayOrders();
        int orderNumb = cons.queryUserInt("What order number would you like to be removed?");
        orderD.removeOrder(orderNumb);
        cons.displayUserString("Order has been removed! \n");
    }

    private void listAllStates() {
        TaxDAOFileImpl tDFI = new TaxDAOFileImpl();
        ArrayList<String> states = tDFI.getStates();

        for (String currentState : states) {
            cons.displayUserString(currentState);
        }

    }

}
