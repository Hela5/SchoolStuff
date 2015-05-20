/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.SpecialEleven;
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
public class SpecialElevenTest {

    public SpecialElevenTest() {
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
    public void specialElevenTest1() {
        SpecialEleven testMe = new SpecialEleven();
        
        int i1 = 22;
        boolean result = testMe.SpecialEleven(i1);
        assertTrue(result);
    }
    
      @Test
    public void specialElevenTest2() {
        SpecialEleven testMe = new SpecialEleven();
        
        int i1 = 23;
        boolean result = testMe.SpecialEleven(i1);
        assertTrue(result);
    }
    
      @Test
    public void specialElevenTest3() {
        SpecialEleven testMe = new SpecialEleven();
        
        int i1 = 24;
        boolean result = testMe.SpecialEleven(i1);
        assertFalse(result);
    }

}
