/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionaljunittest;

import static java.lang.Math.abs;

/**
 *
 * @author apprentice
 */
public class NearHundred {
//    Given an int n, return true if it is within 10 of 100 or 200.
//Hint: Check out the C# Math class for absolute value
//
//NearHundred(103) -> true
//NearHundred(90) -> true
//NearHundred(89) -> false

public boolean nearHundred(int n) {
    if (abs(n) == 90 || abs(n) == 110) {
        return true;
    } else if (abs(n) == 190 || abs(n) == 210) {
        return true;
    } return false;
}   
}
