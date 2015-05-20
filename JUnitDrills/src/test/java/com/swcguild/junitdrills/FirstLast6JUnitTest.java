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
public class FirstLast6JUnitTest {
    
    public FirstLast6JUnitTest() {
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
    public void firstLastTest() {
        FirstLast6 firstTry = new FirstLast6();
        
        boolean result;
        int[] number = {1, 2, 6};
        result = firstTry.firstLast6(number);
        assertTrue(result);
        
        boolean result2;
        int[] numero = {6, 1, 2, 3};
        result2 = firstTry.firstLast6(numero);
        assertTrue(result2);
        
        boolean result3;
        int[] number3 = {13, 6, 1, 2, 3};
        result3 = firstTry.firstLast6(number3);
        assertFalse(result3);
        
        
        
    }
}
