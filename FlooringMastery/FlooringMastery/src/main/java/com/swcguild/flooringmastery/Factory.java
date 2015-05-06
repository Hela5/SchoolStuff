/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

/**
 *
 * @author apprentice
 */
public class Factory {

    Order order = new Order();
    OrderDAO orderD = new OrderDAO();
    ConsoleIO cons = new ConsoleIO();
    TaxDAO taxD = new TaxDAOFileImpl();
    ProductDAO prodD = new ProductDAOFileImpl();

    public Order createOrder() {

        String firstName = cons.queryUserString("Please enter the first name of the customer: ");
        String lastName = cons.queryUserString("Please enter the last name of the customer: ");
        String state = cons.queryUserString("Enter the state of residence: ");
//        double taxRate = // get from taxDAO
        String productType = cons.queryUserString("Enter product type desired: ");
        double area = cons.queryUserDouble("Enter area to be covered: ");
//        double costPSF = accessed from ProductDAO
//        double laborCostPSF = accessed from ProductDAO
//        double materialCost = accessed from ProductDAO
//        double laborCost = PRODDAO
//        double tax = from TaxDao
//        double total = from businesslogic

        Order currentOrder = new Order();
        currentOrder.setCustomerFirstName(firstName);
        currentOrder.setCustomerLastName(lastName);
        currentOrder.setState(state);
//        currentOrder.setTaxRate(taxRate);
        currentOrder.setProductType(productType);
        currentOrder.setArea(area);
//        currentOrder.setCostPSF(costPSF);
//        currentOrder.setLaborCostPSF(laborCostPSF);
//        currentOrder.setMaterialCost(materialCost);
//        currentOrder.setLaborCost(laborCost);
//        currentOrder.setTax(tax);
//        currentOrder.setTotal(total);
        orderD.addOrder(currentOrder);

        cons.displayUserString("Order has been created.");
        return currentOrder;
    }

}
