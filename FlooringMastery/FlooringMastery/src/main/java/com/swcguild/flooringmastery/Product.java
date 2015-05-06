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
public class Product {
    
    private String productType;
    
    private double costPSF;
    
    private double laborCostPSF;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getCostPSF() {
        return costPSF;
    }

    public void setCostPSF(double costPSF) {
        this.costPSF = costPSF;
    }

    public double getLaborCostPSF() {
        return laborCostPSF;
    }

    public void setLaborCostPSF(double laborCostPSF) {
        this.laborCostPSF = laborCostPSF;
    }
    
}
