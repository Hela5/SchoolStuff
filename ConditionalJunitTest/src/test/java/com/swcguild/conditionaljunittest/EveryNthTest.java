package com.swcguild.conditionaljunittest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.conditionaljunittest.EveryNth;
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
public class EveryNthTest {
    
    public EveryNthTest() {
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
    public void everyNthTest() {
        EveryNth testMe = new EveryNth();
        
        String first = "Miracle";
        int a = 2;
        String test1 = "Mrce";
        String result1 = testMe.EveryNth(first, a);
        assertEquals(result1, test1);
        
        String second = "abcdefg";
        int b = 2;
        String test2 = "aceg";
        String result2 = testMe.EveryNth(second, b);
        assertEquals(result2, test2);
        
        String third = "abcdefg";
        int c = 3;
        String test3 = "adg";
        String result3 = testMe.EveryNth(third, c);
        assertEquals(result3, test3);
        
        
        
    }
}
