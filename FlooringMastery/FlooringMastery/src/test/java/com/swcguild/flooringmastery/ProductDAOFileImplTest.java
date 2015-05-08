/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.util.ArrayList;
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
public class ProductDAOFileImplTest {
    
    private HashMap<String, Product> testMap = new HashMap<>();
    
    public ProductDAOFileImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ProductDAOFileImpl testIt = new ProductDAOFileImpl();
        testIt.loadProductInfo();
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
    public void getProductTypes() throws Exception {
         ProductDAOFileImpl testIt = new ProductDAOFileImpl();
        testIt.loadProductInfo();
        
        ArrayList<String> test = new ArrayList<>();
        test.add("Carpet");
        test.add("Laminate");
        test.add("Tile");
        test.add("Wood");
        ArrayList<Product> result = testIt.getProductTypes();
        assertEquals(test, result);
        
        
    }
    
    @Test
    public void getCostPSF() throws Exception {
         ProductDAOFileImpl testIt = new ProductDAOFileImpl();
        testIt.loadProductInfo();
        
        String s1 = "Wood";
        double result = testIt.getCostPSF(s1);
        assertEquals(5.15, result, 0.001);
    }
    
    @Test
    public void getLaborCostPSF() throws Exception {
         ProductDAOFileImpl testIt = new ProductDAOFileImpl();
        testIt.loadProductInfo();
        
        String s1 = "Wood";
        double result = testIt.getLaborCostPSF(s1);
        assertEquals(4.75, result, 0.001);
    }
}


