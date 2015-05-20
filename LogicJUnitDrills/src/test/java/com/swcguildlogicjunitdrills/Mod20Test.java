/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.Mod20;
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
public class Mod20Test {
    
    public Mod20Test() {
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
    public void mod20Test1() {
        Mod20 testMe = new Mod20();
        
        int i1 = 20;
        boolean result = testMe.Mod20(i1);
        assertFalse(result);
    }
    
        @Test
    public void mod20Test2() {
        Mod20 testMe = new Mod20();
        
        int i1 = 21;
        boolean result = testMe.Mod20(i1);
        assertTrue(result);
    }
    
        @Test
    public void mod20Test3() {
        Mod20 testMe = new Mod20();
        
        int i1 = 22;
        boolean result = testMe.Mod20(i1);
        assertTrue(result);
    }
}
