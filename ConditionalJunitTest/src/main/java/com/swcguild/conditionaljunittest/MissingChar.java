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
public class MissingChar {
//    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (Don't check for bad index). 
//
//MissingChar("kitten", 1) -> "ktten"
//MissingChar("kitten", 0) -> "itten"
//MissingChar("kitten", 4) -> "kittn"

    public String missingChar(String str, int n) {
        String newS = "";
        if (n < str.length()) {
            if (n == 0) {
                newS = str.substring(1, str.length());
                return newS;
            } else {
                newS = str.substring(0, n) + str.substring(n + 1, str.length());
                return newS;
            }
        }
        return newS;
    }
}
