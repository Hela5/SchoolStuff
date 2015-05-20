package com.swcguild.junitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class Unlucky1Test {
    
    public Unlucky1Test() {
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
    public void unlucky1Test() {
        Unlucky1 doTest = new Unlucky1();
        
        boolean result1;
        int[] firstArray = {1, 3, 4, 5};
        result1 = doTest.Unlucky1(firstArray);
        assertTrue(result1);
        
        boolean result2;
        int[] secondArray ={2, 1, 3, 4, 5};
        result2 = doTest.Unlucky1(secondArray);
        assertTrue(result2);
        
        boolean result3;
        int[] thirdArray = {1, 1, 1};
        result3 = doTest.Unlucky1(thirdArray);
        assertFalse(result3);
                        
    }
}
