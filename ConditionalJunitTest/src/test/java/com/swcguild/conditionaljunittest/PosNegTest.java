/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionaljunittest;

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
public class PosNegTest {
    
    public PosNegTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void PosNegTest1() {
        PosNeg testMe = new PosNeg();
        
        int a1 = 1;
        int a2 = -1;
        boolean b1 = false;
        boolean result = testMe.PosNeg(a1, a2, b1);
        assertTrue(result);
    }
    
     @Test
    public void PosNegTest2() {
        PosNeg testMe = new PosNeg();
        
        int a1 = -1;
        int a2 = 1;
        boolean b1 = false;
        boolean result = testMe.PosNeg(a1, a2, b1);
        assertTrue(result);
    }
    
     @Test
    public void PosNegTest3() {
        PosNeg testMe = new PosNeg();
        
        int a1 = -4;
        int a2 = -5;
        boolean b1 = true;
        boolean result = testMe.PosNeg(a1, a2, b1);
        assertTrue(result);
    }
    
}
