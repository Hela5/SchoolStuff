package com.swcguild.stringjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.stringjunitdrills.MultipleEndings;
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
public class MultipleEndingsTest {

    public MultipleEndingsTest() {
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
    public void multipleEndingsTest1() {
        MultipleEndings testIt = new MultipleEndings();
        
        String s1 = "Hello";
        String result = testIt.multipleEndings(s1);
        assertEquals("lololo", result);
    }
     @Test
    public void multipleEndingsTest2() {
        MultipleEndings testIt = new MultipleEndings();
        
        String s1 = "ab";
        String result = testIt.multipleEndings(s1);
        assertEquals("ababab", result);
    }
     @Test
    public void multipleEndingsTest3() {
        MultipleEndings testIt = new MultipleEndings();
        
        String s1 = "Hi";
        String result = testIt.multipleEndings(s1);
        assertEquals("HiHiHi", result);
    }

}
