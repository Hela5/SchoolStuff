/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.SkipSum;
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
public class SkimSumTest {
    
    public SkimSumTest() {
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
    public void skipSumTest() {
        SkipSum testIt = new SkipSum();
        
        int result1 = testIt.SkipSum(3, 4);
        assertEquals(result1, 7);
        
        int result2 = testIt.SkipSum(9, 4);
        assertEquals(result2, 20);
        
        int result3 = testIt.SkipSum(10, 11);
        assertEquals(result3, 21);
    }
    
}
