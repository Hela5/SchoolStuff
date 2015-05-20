/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.Mod35;
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
public class Mod35Test {

    public Mod35Test() {
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
    public void mod35Test1() {
        Mod35 testMe = new Mod35();

        int i1 = 3;
        boolean result = testMe.Mod35(i1);
        assertTrue(result);
    }

    @Test
    public void mod35Test2() {
        Mod35 testMe = new Mod35();

        int i1 = 10;
        boolean result = testMe.Mod35(i1);
        assertTrue(result);
    }

    @Test
    public void mod35Test3() {
        Mod35 testMe = new Mod35();

        int i1 = 15;
        boolean result = testMe.Mod35(i1);
        assertFalse(result);
    }
}
