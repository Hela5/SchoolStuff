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
public class ParrotTroubleTest {
    
    public ParrotTroubleTest() {
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
    public void ParrotTroubleTest1() {
        ParrotTrouble testMe = new ParrotTrouble();
        
        boolean b1 = true;
        int i2 = 6;
        boolean result = testMe.parrotTrouble(b1, i2);
        assertTrue(result);
    }
    
       @Test
    public void ParrotTroubleTest2() {
        ParrotTrouble testMe = new ParrotTrouble();
        
        boolean b1 = true;
        int i2 = 7;
        boolean result = testMe.parrotTrouble(b1, i2);
        assertFalse(result);
    }
    
       @Test
    public void ParrotTroubleTest3() {
        ParrotTrouble testMe = new ParrotTrouble();
        
        boolean b1 = false;
        int i2 = 6;
        boolean result = testMe.parrotTrouble(b1, i2);
        assertFalse(result);
    }
}
