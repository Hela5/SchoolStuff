/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.CaughtSpeeding;
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
public class CaughtSpeedingTest {
    
    public CaughtSpeedingTest() {
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
    public void CaughtSpeedingTest1() {
        CaughtSpeeding testMe = new CaughtSpeeding();
        
        int a1 = 60;
        boolean a2 = false;
        int result = testMe.CaughtSpeeding(a1, a2);
        assertEquals(0, result);
    }
    
      @Test
    public void CaughtSpeedingTest2() {
        CaughtSpeeding testMe = new CaughtSpeeding();
        
        int a1 =65;
        boolean a2 = false;
        int result = testMe.CaughtSpeeding(a1, a2);
        assertEquals(1, result);
    }
    
      @Test
    public void CaughtSpeedingTest3() {
        CaughtSpeeding testMe = new CaughtSpeeding();
        
        int a1 = 65;
        boolean a2 = true;
        int result = testMe.CaughtSpeeding(a1, a2);
        assertEquals(0, result);
    }
}
