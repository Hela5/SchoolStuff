/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionaljunittest;

/**
 *
 * @author apprentice
 */
public class Makes10 {
//Given two ints, a and b, return true if one if them is 10 or if their sum is 10. 
//
//Makes10(9, 10) -> true
//Makes10(9, 9) -> false
//Makes10(1, 9) -> true

public boolean Makes10(int a, int b) {
    if (a == 10 || b == 10) {
        return true;
    } else if (a + b == 10) {
        return true;
    } return false;
}
}
