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
public class SumDoubleTest {
    
    public SumDoubleTest() {
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
    public void sumDoubleTest1() {
        SumDouble testMe = new SumDouble();
        
        int s1 = 1;
        int s2 = 2;
        int result = testMe.sumDouble(s1, s2);
        assertEquals(3, result);
    }
    
    @Test
    public void sumDoubleTest2() {
        SumDouble testMe = new SumDouble();
        
        int s1 = 3;
        int s2 = 2;
        int result = testMe.sumDouble(s1, s2);
        assertEquals(5, result);
    }
    
    @Test
    public void sumDoubleTest3() {
        SumDouble testMe = new SumDouble();
        
        int s1 = 2;
        int s2 = 2;
        int result = testMe.sumDouble(s1, s2);
        assertEquals(8, result);
    }
}
