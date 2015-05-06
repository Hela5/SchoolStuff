/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class OrderDAO {

    HashMap<Integer, Order> orders = new HashMap<>();
//    Order nOrder = new Order();
//    String date = nOrder.getDate();
    public final String ORDER = "Order_12345.txt";
    public final static String DELIMITER = ",";
    private int orderNum = 0;

    public void loadOrdersList() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ORDER)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Order currentOrder = new Order();
            currentOrder.setOrderNum(Integer.parseInt(currentTokens[0]));
            currentOrder.setCustomerFirstName(currentTokens[1]);
            currentOrder.setCustomerLastName(currentTokens[2]);
            currentOrder.setState(currentTokens[3]);
            currentOrder.setTaxRate(Double.parseDouble(currentTokens[4]));
            currentOrder.setProductType(currentTokens[5]);
            currentOrder.setArea(Double.parseDouble(currentTokens[6]));
            currentOrder.setCostPSF(Double.parseDouble(currentTokens[7]));
            currentOrder.setLaborCostPSF(Double.parseDouble(currentTokens[8]));
            currentOrder.setMaterialCost(Double.parseDouble(currentTokens[9]));
            currentOrder.setLaborCost(Double.parseDouble(currentTokens[10]));
            currentOrder.setTax(Double.parseDouble(currentTokens[11]));
            currentOrder.setTotal(Double.parseDouble(currentTokens[12]));
            orders.put(currentOrder.getOrderNum(), currentOrder);
        }
        sc.close();

    }

    public void writeOrdersList() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(ORDER));
        ArrayList<Integer> keys = this.displayOrders();
        for (int key : orders.keySet()) {
            Order currentOrder = orders.get(key);
            out.println(currentOrder.getOrderNum() + DELIMITER
                    + currentOrder.getCustomerFirstName() + DELIMITER
                    + currentOrder.getCustomerLastName() + DELIMITER
                    + currentOrder.getState() + DELIMITER
                    + currentOrder.getTaxRate() + DELIMITER
                    + currentOrder.getProductType() + DELIMITER
                    + currentOrder.getArea() + DELIMITER
                    + currentOrder.getCostPSF() + DELIMITER
                    + currentOrder.getLaborCostPSF() + DELIMITER
                    + currentOrder.getMaterialCost() + DELIMITER
                    + currentOrder.getLaborCost() + DELIMITER
                    + currentOrder.getTax() + DELIMITER
                    + currentOrder.getTotal());
            out.flush();
        }
        out.close();
    }

    public void addOrder(Order order) {
        order.setOrderNum(orderNum);
        orders.put(orderNum, order);
        orderNum++;
    }

    public Order removeOrder(int orderNum) {
        return orders.remove(orderNum);
    }

    public ArrayList displayOrders() {
        Collection<Order> orderList = orders.values();
        ArrayList<Order> list = new ArrayList<>();
        list.addAll(orderList);
        return list;
    }

    public Order getOrder(int orderNum) {
        return orders.get(orderNum);
    }

}
