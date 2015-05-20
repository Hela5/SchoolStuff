/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.simplecalculator.MathOps;
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
public class MathOpsJUnitTest {
    
    public MathOpsJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void MathOpsAddition() {
        MathOps adder = new MathOps();
        int result = adder.add(10, 10);
        assertEquals(20, result);
    }
    
    @Test
    public void MathOpsSubtraction() {
        MathOps sub = new MathOps();
        int result = sub.subract(20, 10);
        assertEquals(10, result);
    }
    
    @Test
    public void MathOpsMultiplication() {
        MathOps mult = new MathOps();
        int result = mult.multiply(10, 10);
        assertEquals(100, result);
    }
    
    @Test
    public void MathOpsDivision() {
        MathOps div = new MathOps();
        double result = div.divide(100, 3);
        assertEquals(33.3, result, 0.1);
    }
    
    @Test
    public void MathOpsDivZero() {
        MathOps zero = new MathOps();
        double result = zero.divide(10, 0);
        assertEquals(0, result, 0.000);
    }
}
