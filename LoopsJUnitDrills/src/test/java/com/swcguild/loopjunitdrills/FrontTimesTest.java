package com.swcguild.loopjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.loopsjunitdrills.FrontTimes;
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
public class FrontTimesTest {

    public FrontTimesTest() {
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
    public void FrontTimesTest1() {
        FrontTimes testMe = new FrontTimes();

        String s1 = "Chocolate";
        int a1 = 2;
        String result = testMe.frontTimes(s1, a1);
        assertEquals("ChoCho", result);
    }

    @Test
    public void FrontTimesTest2() {
        FrontTimes testMe = new FrontTimes();

        String s1 = "Chocolate";
        int a1 = 3;
        String result = testMe.frontTimes(s1, a1);
        assertEquals("ChoChoCho", result);
    }

    @Test
    public void FrontTimesTest3() {
        FrontTimes testMe = new FrontTimes();

        String s1 = "Abc";
        int a1 = 3;
        String result = testMe.frontTimes(s1, a1);
        assertEquals("AbcAbcAbc", result);
    }

}
