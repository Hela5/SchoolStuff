package com.swcguild.junitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.junitdrills.Make2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Make2Test {
    
    public Make2Test() {
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
    public void make2Test() {
        Make2 doTest = new Make2();
        
        int[] array1 = {4, 5};
        int[] array2 = {1, 2, 3};
        int[] test = {4, 5};
        int result[] = doTest.make2(array1, array2);
        Assert.assertArrayEquals(result, test);
        
        int[] array3 = {4};
        int[] array4 = {1, 2, 3};
        int[] test2 = {4, 1};
        int result2[] = doTest.make2(array3, array4);
        Assert.assertArrayEquals(result2, test2);
        
        int[] array5 = {};
        int[] array6 = {1, 2};
        int[] test3 = {1, 2};
        int result3[] = doTest.make2(array5, array6);
        Assert.assertArrayEquals(result3, test3);
        
    }
}
