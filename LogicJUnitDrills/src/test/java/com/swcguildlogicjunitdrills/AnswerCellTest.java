/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.AnswerCell;
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
public class AnswerCellTest {

    public AnswerCellTest() {
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
    public void AnswerCellTest1() {
        AnswerCell testMe = new AnswerCell();

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean result = testMe.AnswerCell(b1, b2, b3);
        assertTrue(result);
    }

    @Test
    public void AnswerCellTest2() {
        AnswerCell testMe = new AnswerCell();

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = true;
        boolean result = testMe.AnswerCell(b1, b2, b3);
        assertFalse(result);
    }

    @Test
    public void AnswerCellTest3() {
        AnswerCell testMe = new AnswerCell();

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean result = testMe.AnswerCell(b1, b2, b3);
        assertFalse(result);
    }
}
