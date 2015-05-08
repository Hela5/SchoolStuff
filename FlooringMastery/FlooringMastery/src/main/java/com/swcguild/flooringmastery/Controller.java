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
    OrderDAOIF orderD = new OrderDAOFileImpl();
    Factory fact = new Factory();
    private String currentDate;
    TaxDAO taxD = new TaxDAOFileImpl();

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

        boolean wrongNumbers = false;
        boolean notADateFool = true;
        do {

            currentDate = cons.queryUserString("Please enter the date in the format of: MMDDYYYY");

            if (currentDate.length() != 8) {
                notADateFool = true;
                cons.displayUserString("Please make sure the date is in correct format");
            } else if (currentDate.length() == 8) {
                notADateFool = false;
            }

            cons.displayUserString("Make sure you're using a real date.");
            String month = currentDate.substring(0, 2);
            String day = currentDate.substring(2, 4);
            String year = currentDate.substring(4, 8);
            wrongNumbers = false;
            if (Integer.parseInt(month) < 01 || Integer.parseInt(month) > 12) {
                wrongNumbers = true;
            } else if (Integer.parseInt(day) < 01 || Integer.parseInt(day) > 31) {
                wrongNumbers = true;
            } else if (Integer.parseInt(year) < 1900 || Integer.parseInt(year) > 2020) {
                wrongNumbers = true;
            }

        } while (wrongNumbers || notADateFool);

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

                    cons.displayUserString("Let's find your order...\n");
                    displayOrders();
                    break;
                case 2:
                    cons.displayUserString("Let's add an order...\n");
                    addOrder();

                    break;
                case 3:
                    cons.displayUserString("Edit function is currently under construction.\n");
                    break;
                case 4:
                    cons.displayUserString("Let's remove an order...\n");
                    removeOrder();
                    break;
                case 5:
                    if (orderD.isCanSave() == false) {
                        cons.displayUserString("Config mode: can't save.\n");

                        break;
                    }
                    try {
                        orderD.writeOrdersList(currentDate);
                    } catch (IOException ex) {
                        cons.displayUserString(ex.getMessage());
                    }
                    cons.displayUserString("\nChanges have been saved.\n");
                    break;
                case 6:
                    cons.displayUserString("\nThank you for your business today.");
                    keepRunning = false;
                    break;
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
            cons.displayUserString("-------------------------------------------");
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
    boolean notState = true;
    boolean notProductType = true;
    boolean notAcceptable = true;

    private void addOrder() {

        String firstName = cons.queryUserString("Please enter the first name of the customer: ");
        String lastName = cons.queryUserString("Please enter the last name of the customer: ");
        String state;
        do {
//            String secondChoice;
            state = cons.queryUserString("Enter the state in which the customer wants service: ");
            state = state.toUpperCase();

//            secondChoice = cons.queryUserString("Sorry, not a valid state.\nPlease choose from the following states: OH, PA, MI, IN");
            if (state.equals("OH")) {
                notState = false;
            } else if (state.equals("PA")) {
                notState = false;
            } else if (state.equals("MI")) {
                notState = false;
            } else if (state.equals("IN")) {
                notState = false;

            }
        } while (notState);

        String productType;

        do {

            productType = cons.queryUserString("Enter product type desired: ");
            productType = productType.toUpperCase();

            if (productType.equals("CARPET")) {
                notProductType = false;
            } else if (productType.equals("LAMINATE")) {
                notProductType = false;
            } else if (productType.equals("TILE")) {
                notProductType = false;
            } else if (productType.equals("WOOD")) {
                notProductType = false;
            }

        } while (notProductType);

        double area;
        do {

            area = cons.queryUserDouble("Enter area to be covered: ");
            if (area > 0) {
                notAcceptable = false;

            }
        } while (notAcceptable);

        orderD.addOrder(fact.createOrder(firstName, lastName, area, productType, state));
    }

    private void removeOrder() {
        displayOrders();
        int orderNumb = cons.queryUserInt("What order number would you like to be removed?");
        orderD.removeOrder(orderNumb);
        cons.displayUserString("Order has been removed! \n");
    }

    private void listAllStates() {

        ArrayList<String> states = taxD.getStates();

        for (String currentState : states) {
            cons.displayUserString(currentState);
        }

    }

}
