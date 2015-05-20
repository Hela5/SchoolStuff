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
public class AbbaTest {
    
    public AbbaTest() {
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
    public void abbaTest() {
        Abba testMe = new Abba();
        
        String s1 = "Hi";
        String s2 = "Bye";
        String result1 = testMe.Abba(s1, s2);
        assertEquals(result1, "HiByeByeHi");
        
        String s3 = "Yo";
        String s4 = "Alice";
        String result2 = testMe.Abba(s3, s4);
        assertEquals(result2, "YoAliceAliceYo");
        
        String s5 = "What";
        String s6 = "Up";
        String result3 = testMe.Abba(s5, s6);
        assertEquals(result3, "WhatUpUpWhat");
       
    }
}
