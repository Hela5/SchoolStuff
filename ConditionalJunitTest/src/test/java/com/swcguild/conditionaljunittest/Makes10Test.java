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
public class Makes10Test {
    
    public Makes10Test() {
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
    public void Makes10Test1() {
        Makes10 testMe = new Makes10();
        
        int a1 = 9;
        int a2 = 10;
        boolean result = testMe.Makes10(a1, a2);
        assertTrue(result);
    }
    
       @Test
    public void Makes10Test2() {
        Makes10 testMe = new Makes10();
        
        int a1 = 9;
        int a2 = 9;
        boolean result = testMe.Makes10(a1, a2);
        assertFalse(result);
    }
    
       @Test
    public void Makes10Test3() {
        Makes10 testMe = new Makes10();
        
        int a1 = 1;
        int a2 = 9;
        boolean result = testMe.Makes10(a1, a2);
        assertTrue(result);
    }
}
