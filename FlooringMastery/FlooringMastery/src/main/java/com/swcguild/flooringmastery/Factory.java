/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.FileNotFoundException;

/**
 *
 * @author apprentice
 */
public class Factory {

    Order order = new Order();
    OrderDAOIF orderD = new OrderDAOFileImpl();
    ConsoleIO cons = new ConsoleIO();
    TaxDAOFileImpl taxD = new TaxDAOFileImpl();
    ProductDAOFileImpl prodD = new ProductDAOFileImpl();

    public Order createOrder(String firstName, String lastName, double area, String productType, String state) {
        try {
        taxD.loadTaxInfo();
        prodD.loadProductInfo();
        } catch (FileNotFoundException e) {
            cons.displayUserString(e.getMessage());
        }
        
        
        double taxRate = taxRate(state);
        double materialCostPSF = materialCostPSF(productType);
        double laborCostPSF = laborCostPSF(productType);
        double materialCost = materialCost(area, materialCostPSF);
        double laborCost = laborCost(area, laborCostPSF);
        double tax = tax(area, materialCost, laborCost);
        double total = total(tax, materialCost, laborCost);

        Order currentOrder = new Order();
        currentOrder.setCustomerFirstName(firstName);
        currentOrder.setCustomerLastName(lastName);
        currentOrder.setState(state);
        currentOrder.setTaxRate(taxRate);
        currentOrder.setProductType(productType);
        currentOrder.setArea(area);
        currentOrder.setCostPSF(materialCostPSF);
        currentOrder.setLaborCostPSF(laborCostPSF);
        currentOrder.setMaterialCost(materialCost);
        currentOrder.setLaborCost(laborCost);
        currentOrder.setTax(tax);
        currentOrder.setTotal(total);
//        orderD.addOrder(currentOrder);

        cons.displayUserString("Order has been created.\n");
        return currentOrder;
    }

    private double taxRate(String state) {
        double taxRate = taxD.getTaxRate(state);
        return taxRate;
    }

    private double materialCostPSF(String productType) {
        double costPSF = prodD.getCostPSF(productType);
        return costPSF;
    }

    private double laborCostPSF(String productType) {
        double lbc = prodD.getLaborCostPSF(productType);
        return lbc;
    }

    private double materialCost(double area, double costPSF) {
        double mc = area * costPSF;
        return mc;
    }

    private double laborCost(double area, double laborCostPSF) {
        double lc = area * laborCostPSF;
        return lc;
    }
    
    private double tax(double taxRate, double materialCost, double laborCost) {
        double t1 = (materialCost + laborCost) * taxRate/100;
        return t1;
    }
    
    private double total(double tax, double materialCost, double laborCost) {
        double tT = tax + materialCost + laborCost;
        return tT;
    }
    
    

}
