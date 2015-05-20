/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionaljunittest;

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
public class SleepingInTest {

    public SleepingInTest() {
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
    public void SleepingInTest() {
        SleepingIn testMe = new SleepingIn();

        boolean result = testMe.CanSleepIn(false, false);
        assertEquals(true, result);

    }

    @Test
    public void SleepingInTest2() {
        SleepingIn testMe = new SleepingIn();

        boolean result = testMe.CanSleepIn(true, false);
        assertEquals(false, result);

    }

    @Test
    public void SleepingInTest3() {
        SleepingIn testMe = new SleepingIn();

        boolean result = testMe.CanSleepIn(false, true);
        assertEquals(true, result);

    }
}
