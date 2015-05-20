/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.InRange;
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
public class InRangeTest {

    public InRangeTest() {
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
    public void inRangeTest1() {
        InRange testMe = new InRange();

        int i1 = 5;
        boolean b1 = false;
        boolean result = testMe.InRange(i1, b1);
        assertEquals(true, result);
    }

    @Test
    public void inRangeTest2() {
        InRange testMe = new InRange();

        int i1 = 11;
        boolean b1 = false;
        boolean result = testMe.InRange(i1, b1);
        assertEquals(false, result);
    }

    @Test
    public void inRangeTest3() {
        InRange testMe = new InRange();

        int i1 = 11;
        boolean b1 = true;
        boolean result = testMe.InRange(i1, b1);
        assertEquals(true, result);
    }

}
