package com.swcguildlogicjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.logicjunitdrills.PlayOutside;
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
public class PlayOutsideTest {
    
    public PlayOutsideTest() {
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
    public void playOutsideTest() {
        PlayOutside testIt = new PlayOutside();
        
        boolean result1 = testIt.PlayOutside(70, false);
        assertTrue(result1);
        
        boolean result2 = testIt.PlayOutside(95, false);
        assertFalse(result2);
        
        boolean result3 = testIt.PlayOutside(95, true);
        assertTrue(result3);
    }
    
}
