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
public class SameFirstLastTest {
    
    public SameFirstLastTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void SameFirstLastTest() {
        SameFirstLast letsTest = new SameFirstLast();
        
        boolean result1;
        int[] firstArray = {1, 2, 3};
        result1 = letsTest.sameFirstLast(firstArray);
        assertFalse(result1);
        
        boolean result2;
        int[] secondArray = {1, 2, 3, 1};
        result2 = letsTest.sameFirstLast(secondArray);
        assertTrue(result2);
        
        boolean result3;
        int[] thirdArray = {1, 2, 1};
        result3 = letsTest.sameFirstLast(thirdArray);
        assertTrue(result3);
        
        
        
    }
}
