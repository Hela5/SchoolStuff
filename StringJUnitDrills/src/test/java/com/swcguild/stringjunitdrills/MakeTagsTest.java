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
public class MakeTagsTest {

    public MakeTagsTest() {
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
    public void makeTagsTest() {
        MakeTags testMe = new MakeTags();

        String t1 = "i";
        String t2 = "Yay";
        String result1 = testMe.MakeTags(t1, t2);
        assertEquals(result1, "<i>Yay</i>");
    }

    @Test
    public void makeTagsTest2() {
        MakeTags testMe = new MakeTags();

        String t1 = "i";
        String t2 = "Hello";
        String result1 = testMe.MakeTags(t1, t2);
        assertEquals(result1, "<i>Hello</i>");
    }

    @Test
    public void makeTagsTest3() {
        MakeTags testMe = new MakeTags();

        String t1 = "cite";
        String t2 = "Yay";
        String result1 = testMe.MakeTags(t1, t2);
        assertEquals(result1, "<cite>Yay</cite>");
    }
}
