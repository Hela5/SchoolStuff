package com.swcguild.junitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class SumTest {
    
    public SumTest() {
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
    public void sumTest() {
        Sum addNums = new Sum();
        
        int result1 = 0;
        int[] firstArray = {1, 2, 3};
        result1 = addNums.sum(firstArray);
        System.out.println(result1);
        
        int result2 = 0;
        int[] secondArray = {5, 11, 2};
        result2 = addNums.sum(secondArray);
        System.out.println(result2);
        
        int result3 = 0;
        int[] thirdArray = {7, 0, 0};
        result3 = addNums.sum(thirdArray);
        System.out.println(result3);
        
    }
    
}
