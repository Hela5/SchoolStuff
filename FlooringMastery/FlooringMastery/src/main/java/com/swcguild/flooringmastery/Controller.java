/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;

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

    public void run() {
        Order bobby = new Order();
//        bobby.setOrderNum(1);
        bobby.setDate("01012014");
        bobby.setCustomerFirstName("Bob");
        bobby.setCustomerLastName("Bobby");
        bobby.setState("OH");
        bobby.setTaxRate(6.25);
        bobby.setProductType("carpet");
        bobby.setArea(20.0);
        bobby.setCostPSF(2.25);
        bobby.setLaborCostPSF(2.10);
        bobby.setMaterialCost(45.0);
        bobby.setLaborCost(42.0);
        bobby.setTax(5.4375);
        bobby.setTotal(92.44);
        orderD.addOrder(bobby);

        Order sally = new Order();
//        sally.setOrderNum(2);
        sally.setDate("01012014");
        sally.setCustomerFirstName("Sal");
        sally.setCustomerLastName("Sally");
        sally.setState("PA");
        sally.setTaxRate(6.75);
        sally.setProductType("Wood");
        sally.setArea(20.0);
        sally.setCostPSF(5.15);
        sally.setLaborCostPSF(4.75);
        sally.setMaterialCost(103.0);
        sally.setLaborCost(95.0);
        sally.setTax(13.365);
        sally.setTotal(211.365);
        orderD.addOrder(sally);

//loads Taxes.txt (tax file)        
                TaxDAOFileImpl f = new TaxDAOFileImpl();
        try {
            f.loadTaxInfo();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
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
                    listAllStates();

                    break;
                case 4:
                    cons.displayUserString("Let's remove an order...");
                    removeOrder();
                    break;
                case 5:
                    try {
                        orderD.writeOrdersList();
                    } catch (IOException ex) {
                        cons.displayUserString(ex.getMessage());
                    }
                    break;
                case 6:
                    cons.displayUserString("Thank you for your business today.");
                    keepRunning = false;
                    break;
                case 7:
                    try {
                        orderD.loadOrdersList();
                    } catch (FileNotFoundException ex) {
                        cons.displayUserString(ex.getMessage());
                    }
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
//        String searchDate = cons.queryUserString("Enter date of invoice you're searching for: ");
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
        fact.createOrder();

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
