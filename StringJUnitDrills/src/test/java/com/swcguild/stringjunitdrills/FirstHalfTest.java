/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.stringjunitdrills;

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
public class FirstHalfTest {
    
    public FirstHalfTest() {
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
    public void firstHalfTest1() {
        FirstHalf testMe = new FirstHalf();
        
        String s1 = "WooHoo";
        String result = testMe.firstHalf(s1);
        assertEquals("Woo", result);
        
    }
    
       @Test
    public void firstHalfTest2() {
        FirstHalf testMe = new FirstHalf();
        
        String s1 = "HelloThere";
        String result = testMe.firstHalf(s1);
        assertEquals("Hello", result);
        
    }
    
       @Test
    public void firstHalfTest3() {
        FirstHalf testMe = new FirstHalf();
        
        String s1 = "abcdef";
        String result = testMe.firstHalf(s1);
        assertEquals( "abc", result);
        
    }
}
