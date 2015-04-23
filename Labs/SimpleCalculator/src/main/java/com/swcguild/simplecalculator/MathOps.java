/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.simplecalculator;

/**
 *
 * @author apprentice
 */
public class MathOps {
    
    public int add(int op1, int op2) {
        return op1 + op2;
    }

    public int subract(int op1, int op2) {
        return op1 - op2;
    }
    
    public int multiply(int op1, int op2) {
        return op1 * op2;
     }
    
    public double divide(int op1, int op2) {
        if (op2 == 0) {
            return 0;
        }
        return (double) op1 / op2;
    }
 
}