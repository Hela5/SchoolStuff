/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public interface OrderDAOIF {

    public void loadConfig() throws FileNotFoundException;

    public void loadOrdersList(String currentDate) throws FileNotFoundException;

    public void writeOrdersList(String currentDate) throws IOException;

    public void addOrder(Order order);

    public Order removeOrder(int orderNum);

    public Order getOrder(int orderNum);

    public ArrayList displayOrders();
    
    public boolean isCanSave();

}
