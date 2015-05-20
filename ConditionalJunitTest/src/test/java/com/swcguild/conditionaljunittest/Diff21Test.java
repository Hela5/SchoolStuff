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
public class Diff21Test {
    
    public Diff21Test() {
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
    public void Diff21Test1() {
        Diff21 testMe = new Diff21();
        
        int a1 = 23;
        int result = testMe.diff21(a1);
        assertEquals(4, result);
    }
    
    @Test
    public void Diff21Test2() {
        Diff21 testMe = new Diff21();
        
        int a1 = 10;
        int result = testMe.diff21(a1);
        assertEquals(11, result);
    }
    
    @Test
    public void Diff21Test3() {
        Diff21 testMe = new Diff21();
        
        int a1 = 21;
        int result = testMe.diff21(a1);
        assertEquals(0, result);
    }
}
