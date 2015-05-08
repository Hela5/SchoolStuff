/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.FileNotFoundException;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class OrderDAOFileImplTest {
    
    public OrderDAOFileImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException {
        OrderDAOFileImpl testMe = new OrderDAOFileImpl();
        String currentDate = "";
        testMe.loadConfig();
        testMe.loadOrdersList("05092015");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void addOrderTest() {
        //set
        OrderDAOIF testMe = new OrderDAOFileImpl();
        
        Order ord = new Order();
        ord.setOrderNum(1);
        ord.setCustomerFirstName("Billy");
        ord.setCustomerLastName("Billerson");
        ord.setState("OH");
        ord.setTaxRate(6.25);
        ord.setProductType("Wood");
        ord.setArea(100.0);
        ord.setCostPSF(5.15);
        ord.setLaborCostPSF(4.75);
        ord.setMaterialCost(515.0);
        ord.setLaborCost(475.0);
        ord.setTax(61.88);
        ord.setTotal(1051.88);
      
       
        //act
        testMe.addOrder(ord);
        
        //assert
        Order result = testMe.getOrder(1);
        assertEquals(ord, result);
        
        
    }
}
