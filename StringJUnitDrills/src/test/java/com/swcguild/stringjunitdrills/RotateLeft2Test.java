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
public class RotateLeft2Test {
    
    public RotateLeft2Test() {
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
    public void rotateLeft2Test1() {
        RotateLeft2 testMe = new RotateLeft2();
        
        String s1 = "Hello";
        String result = testMe.rotateleft2(s1);
        assertEquals("lloHe", result);
    }
    
       @Test
    public void rotateLeft2Test2() {
        RotateLeft2 testMe = new RotateLeft2();
        
        String s1 = "java";
        String result = testMe.rotateleft2(s1);
        assertEquals("vaja", result);
    }
    
       @Test
    public void rotateLeft2Test3() {
        RotateLeft2 testMe = new RotateLeft2();
        
        String s1 = "Hi";
        String result = testMe.rotateleft2(s1);
        assertEquals("Hi", result);
    }
    
}
