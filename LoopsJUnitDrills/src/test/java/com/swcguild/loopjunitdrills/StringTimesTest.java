/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loopjunitdrills;

import com.swcguild.loopsjunitdrills.StringTimes;
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
public class StringTimesTest {

    public StringTimesTest() {
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
    public void stringTimesTest1() {
        StringTimes testMe = new StringTimes();

        int a1 = 2;
        String a2 = "Hi";
        String result = testMe.stringTimes(a2, a1);
        assertEquals("HiHi", result);
    }
    
    @Test
    public void stringTimesTest2() {
        StringTimes testMe = new StringTimes();

        int a1 = 3;
        String a2 = "Hi";
        String result = testMe.stringTimes(a2, a1);
        assertEquals("HiHiHi", result);
    }
    
    @Test
    public void stringTimesTest3() {
        StringTimes testMe = new StringTimes();

        int a1 = 1;
        String a2 = "Hi";
        String result = testMe.stringTimes(a2, a1);
        assertEquals("Hi", result);
    }
}
