/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguildlogicjunitdrills;

import com.swcguild.logicjunitdrills.AlarmClock;
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
public class AlarmClockTest {
    
    public AlarmClockTest() {
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
    public void alarmClockTest() {
        AlarmClock testIt = new AlarmClock();
        
        String result1 = testIt.AlarmClock(1, false);
        assertEquals(result1, "7:00");
        
        String result2 = testIt.AlarmClock(5, false);
        assertEquals(result1, "7:00");
        
        String result3 = testIt.AlarmClock(0, false);
        assertEquals(result3, "10:00");
    }
}
