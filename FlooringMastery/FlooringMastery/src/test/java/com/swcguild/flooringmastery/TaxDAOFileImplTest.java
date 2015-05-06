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
public class TaxDAOFileImplTest {
    
    private HashMap<String, Tax> testMap = new HashMap<>();
    TaxDAOFileImpl testIt = new TaxDAOFileImpl();
    
    
    public TaxDAOFileImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        TaxDAOFileImpl testIt = new TaxDAOFileImpl();
        testIt.loadTaxInfo();
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
    public void getTaxRateTest() throws Exception {
        TaxDAOFileImpl testIt = new TaxDAOFileImpl();
        testIt.loadTaxInfo();
        
        String newState = "OH";
        double result = testIt.getTaxRate(newState);
        assertEquals(6.25, result, 0.001);
    }
    
    @Test
    public void getStates() throws Exception {
        TaxDAOFileImpl testIt = new TaxDAOFileImpl();
        testIt.loadTaxInfo();
        
        ArrayList<String> test = new ArrayList<>();
        test.add("OH");
        test.add("PA");
        test.add("MI");
        test.add("IN");
        ArrayList<Tax> result = testIt.getStates();
        assertEquals(test, result);
    }
}
