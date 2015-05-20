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
public class MischieviousChildrenTest {

    public MischieviousChildrenTest() {
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
    public void mischieviousChildrenTest1() {
        MischieviousChildren testMe = new MischieviousChildren();

        boolean testB = true;
        boolean result = testMe.AreWeInTrouble(true, true);
        assertEquals(true, result);
    }

    @Test
    public void mischieviousChildrenTest2() {
        MischieviousChildren testMe = new MischieviousChildren();

        boolean testB = true;
        boolean result = testMe.AreWeInTrouble(false, false);
        assertEquals(true, result);
    }

    @Test
    public void mischieviousChildrenTest3() {
        MischieviousChildren testMe = new MischieviousChildren();

        boolean testB = true;
        boolean result = testMe.AreWeInTrouble(true, false);
        assertEquals(false, result);
    }
}
