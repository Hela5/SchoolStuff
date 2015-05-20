package com.swcguild.loopjunitdrills;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.loopsjunitdrills.NoTriples;
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
public class NoTriplesTest {

    public NoTriplesTest() {
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
    public void noTriplesTest1() {
        NoTriples doTest = new NoTriples();

        boolean result1;
        int[] firstArray = {1, 1, 2, 2, 1};
        result1 = doTest.noTriples(firstArray);
        assertTrue(result1);

        boolean result2;
        int[] secondArray = {1, 1, 2, 2, 2, 1};
        result2 = doTest.noTriples(secondArray);
        assertFalse(result2);

        boolean result3;
        int[] thirdArray = {1, 1, 1, 2, 2, 2, 1};
        result3 = doTest.noTriples(thirdArray);
        assertFalse(result3);

    }
}
