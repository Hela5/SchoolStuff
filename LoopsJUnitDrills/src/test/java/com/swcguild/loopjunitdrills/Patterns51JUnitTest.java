package com.swcguild.loopjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.loopsjunitdrills.Pattern51;
import com.swcguild.loopsjunitdrills.Pattern51;
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
public class Patterns51JUnitTest {
    
    public Patterns51JUnitTest() {
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
    public void pattern51Test() {
        Pattern51 newTry = new Pattern51();
        
        boolean result1;
        int[] array1 = {1, 2, 7, 1};
        result1 = newTry.pattern51(array1);
        assertTrue(result1);
        
        boolean result2;
        int[] array2 = {1, 2, 8, 1};
        result2 = newTry.pattern51(array2);
        assertFalse(result2);
        
        boolean result3;
        int[] array3 = {2, 7, 1};
        result3 = newTry.pattern51(array3);
        assertTrue(result3);
       
    }
}
