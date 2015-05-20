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
public class SayHiTest {
    
    public SayHiTest() {
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
    public void sayHiTest() {
        SayHi testMe = new SayHi();
        
        String testName1 = "Bob";
        String result1 = testMe.sayHi(testName1);
        assertEquals(result1, "Hello Bob!");
        
        String testName2 = "Alice";
        String result2 = testMe.sayHi(testName2);
        assertEquals(result2, "Hello Alice!");
        
        String testName3 = "X";
        String result3 = testMe.sayHi(testName3);
        assertEquals(result3, "Hello X!");
        
    }
    
}
