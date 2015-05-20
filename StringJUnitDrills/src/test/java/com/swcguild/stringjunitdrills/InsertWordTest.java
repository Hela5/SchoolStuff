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
public class InsertWordTest {

    public InsertWordTest() {
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
    public void insertWordTest1() {
        InsertWord testIt = new InsertWord();

        String s1 = "<<>>";
        String s2 = "Yay";
        String result1 = testIt.insertWord(s1, s2);
        assertEquals(result1, "<<Yay>>");

    }
}
