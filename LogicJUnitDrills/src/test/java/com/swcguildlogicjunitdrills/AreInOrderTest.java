/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.AreInOrder;
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
public class AreInOrderTest {

    public AreInOrderTest() {
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
    public void AreInOrderTest1() {
        AreInOrder testMe = new AreInOrder();

        int a1 = 1;
        int a2 = 2;
        int a3 = 4;
        boolean a4 = false;
        boolean result = testMe.areInOrder(a1, a2, a3, a4);
        assertTrue(result);
    }
    
        @Test
    public void AreInOrderTest2() {
        AreInOrder testMe = new AreInOrder();

        int a1 = 1;
        int a2 = 2;
        int a3 = 1;
        boolean a4 = false;
        boolean result = testMe.areInOrder(a1, a2, a3, a4);
        assertFalse(result);
    }
    
        @Test
    public void AreInOrderTest3() {
        AreInOrder testMe = new AreInOrder();

        int a1 = 1;
        int a2 = 1;
        int a3 = 2;
        boolean a4 = true;
        boolean result = testMe.areInOrder(a1, a2, a3, a4);
        assertTrue(result);
    }
}
