/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.TwoIsOne;
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
public class TwoIsOneTest {
    
    public TwoIsOneTest() {
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
    public void TwoIsOneTest1() {
        TwoIsOne testMe = new TwoIsOne();
        
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        boolean result = testMe.TwoIsOne(a1, a2, a3);
        assertTrue(result);
    }
    
    @Test
    public void TwoIsOneTest2() {
        TwoIsOne testMe = new TwoIsOne();
        
        int a1 = 3;
        int a2 = 1;
        int a3 = 2;
        boolean result = testMe.TwoIsOne(a1, a2, a3);
        assertTrue(result);
    }
    
    @Test
    public void TwoIsOneTest3() {
        TwoIsOne testMe = new TwoIsOne();
        
        int a1 = 3;
        int a2 = 2;
        int a3 = 2;
        boolean result = testMe.TwoIsOne(a1, a2, a3);
        assertFalse(result);
    }
}
