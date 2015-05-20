package com.swcguildlogicjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.logicjunitdrills.CanHazTable;
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
public class CanHazTableTest {

    public CanHazTableTest() {
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
    public void canHazTableTest2() {
        CanHazTable doTest = new CanHazTable();
        int result = doTest.CanHazTable(5, 10);
        assertEquals(result, 2);
    }
    
    @Test
    public void canHazTable0() {
        CanHazTable doTest = new CanHazTable();
        int result = doTest.CanHazTable(5, 2);
        assertEquals(result, 0);
    }
    
    @Test
    public void canHazTable1() {
        CanHazTable doTest = new CanHazTable();
        int result = doTest.CanHazTable(5, 5);
        assertEquals(result, 1);
    }
}
