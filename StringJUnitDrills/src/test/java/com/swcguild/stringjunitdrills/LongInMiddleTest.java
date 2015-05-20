package com.swcguild.stringjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.stringjunitdrills.LongInMiddle;
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
public class LongInMiddleTest {

    public LongInMiddleTest() {
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
    public void longInMiddleTest1() {
        LongInMiddle testMe = new LongInMiddle();
        
        String s1 = "Hello";
        String s2 = "hi";
        String result = testMe.longInMiddle(s1, s2);
        assertEquals("hiHellohi", result);
    }
      @Test  
    public void longInMiddleTest2() {
        LongInMiddle testMe = new LongInMiddle();
        
        String s1 = "hi";
        String s2 = "Hello";
        String result = testMe.longInMiddle(s1, s2);
        assertEquals("hiHellohi", result);
    }
      @Test  
    public void longInMiddleTest3() {
        LongInMiddle testMe = new LongInMiddle();
        
        String s1 = "aaa";
        String s2 = "b";
        String result = testMe.longInMiddle(s1, s2);
        assertEquals("baaab", result);
    }

}
