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
public class MissingCharTest {
    
    public MissingCharTest() {
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
    public void MissingCharTest1() {
        MissingChar testMe = new MissingChar();
        
        String s1 = "kitten";
        int a1 = 1;
        String result = testMe.missingChar(s1, a1);
        assertEquals("ktten", result);
    }
    
    @Test
    public void MissingCharTest2() {
        MissingChar testMe = new MissingChar();
        
        String s1 = "kitten";
        int a1 = 0;
        String result = testMe.missingChar(s1, a1);
        assertEquals("itten", result);
    }
    
    @Test
    public void MissingCharTest3() {
        MissingChar testMe = new MissingChar();
        
        String s1 = "kitten";
        int a1 = 4;
        String result = testMe.missingChar(s1, a1);
        assertEquals("kittn", result);
    }
}
