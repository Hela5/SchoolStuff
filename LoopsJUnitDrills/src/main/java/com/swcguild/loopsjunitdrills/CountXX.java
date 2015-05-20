/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loopsjunitdrills;

/**
 *
 * @author apprentice
 */
public class CountXX {
//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
//
//CountXX("abcxx") -> 1
//CountXX("xxx") -> 2
//CountXX("xxxx") -> 3

    public int countXX(String str) {
        int countXX = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1) {
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                    countXX++;
                }
            }
        }
        return countXX;

    }
}
