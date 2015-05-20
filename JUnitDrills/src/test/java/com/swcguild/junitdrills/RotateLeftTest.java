/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.junitdrills;

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
public class RotateLeftTest {
    
    public RotateLeftTest() {
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
    public void rotateLeftTest() {
        RotateLeft newPlace = new RotateLeft();
        
        int[] result1;
        int[] firstArray = {1, 2, 3};
        result1 = newPlace.rotateLeft(firstArray);
        System.out.println(result1);
        
        int[] result2;
        int[] secondArray = {5, 11, 9};
        result2 = newPlace.rotateLeft(secondArray);
        System.out.println(result2);
        
        int[] result3;
        int[] thirdArray = {7, 0, 0};
        result3 = newPlace.rotateLeft(thirdArray);
        System.out.println(result3);
    }
}
