/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.LoveSix;
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
public class LoveSixTest {

    public LoveSixTest() {
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
    public void loveSixTest1() {
        LoveSix testMe = new LoveSix();

        int i1 = 6;
        int i2 = 4;
        boolean result = testMe.LoveSix(i1, i2);
        assertEquals(true, result);
    }

    @Test
    public void loveSixTest2() {
        LoveSix testMe = new LoveSix();

        int i1 = 4;
        int i2 = 5;
        boolean result = testMe.LoveSix(i1, i2);
        assertEquals(false, result);
    }

    @Test
    public void loveSixTest3() {
        LoveSix testMe = new LoveSix();

        int i1 = 1;
        int i2 = 5;
        boolean result = testMe.LoveSix(i1, i2);
        assertEquals(true, result);
    }
}
