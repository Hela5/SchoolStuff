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
public class Order {

    private int orderNum;
    private String date;
    private String customerFirstName;
    private String customerLastName;
    private String state;
    private Double taxRate;
    private String productType;
    private Double costPSF;
    private Double laborCostPSF;
    private Double materialCost;
    private Double laborCost;
    private Double tax;
    private Double total;
    private Double area;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getCostPSF() {
        return costPSF;
    }

    public void setCostPSF(Double costPSF) {
        this.costPSF = costPSF;
    }

    public Double getLaborCostPSF() {
        return laborCostPSF;
    }

    public void setLaborCostPSF(Double laborCostPSF) {
        this.laborCostPSF = laborCostPSF;
    }

    public Double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(Double materialCost) {
        this.materialCost = materialCost;
    }

    public Double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(Double laborCost) {
        this.laborCost = laborCost;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

}
