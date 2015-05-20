package com.swcguild.stringjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.stringjunitdrills.TweakFront;
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
public class TweakFrontTest {
    
    public TweakFrontTest() {
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
    public void tweakFrontTest() {
        TweakFront testMe = new TweakFront();
        
        String first = "Hello";
        String test1 = "llo";
        String result1 = testMe.TweakFront(first);
        assertEquals(result1, test1);
        
        String second = "away";
        String test2 = "aay";
        String result2 = testMe.TweakFront(second);
        assertEquals(result2, test2);
        
        String third = "abed";
        String test3 = "abed";
        String result3 = testMe.TweakFront(third);
        assertEquals(result3, test3);
        
    }
}
