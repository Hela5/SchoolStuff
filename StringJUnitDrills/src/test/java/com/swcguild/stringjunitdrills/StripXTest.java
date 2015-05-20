package com.swcguild.stringjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.stringjunitdrills.StripX;
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
public class StripXTest {
    
    public StripXTest() {
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
    public void stripXTest() {
        StripX testIt = new StripX();
        
        String first = "xHix";
        String test1 = "Hi";
        String result1 = testIt.StripX(first);
        assertEquals(result1, test1);
        
        String second = "xHi";
        String test2 = "Hi";
        String result2 = testIt.StripX(second);
        assertEquals(result2, test2);
        
        String third = "Hxix";
        String test3 = "Hxi";
        String result3 = testIt.StripX(third);
        assertEquals(result3, test3);
        
        
    }
}
