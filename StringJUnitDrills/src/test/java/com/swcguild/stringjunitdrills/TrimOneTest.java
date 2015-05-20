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
public class TrimOneTest {

    public TrimOneTest() {
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
    public void trimOneTest1() {
        TrimOne testMe = new TrimOne();

        String s1 = "Hello";
        String result1 = testMe.trimOne(s1);
        assertEquals("ell", result1);

    }

    @Test
    public void trimOneTest2() {
        TrimOne testMe = new TrimOne();

        String s1 = "java";
        String result1 = testMe.trimOne(s1);
        assertEquals("av", result1);

    }

    @Test
    public void trimOneTest3() {
        TrimOne testMe = new TrimOne();

        String s1 = "coding";
        String result1 = testMe.trimOne(s1);
        assertEquals("odin", result1);

    }
}
