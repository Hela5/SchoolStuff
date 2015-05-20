/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.stringjunitdrills;

/**
 *
 * @author apprentice
 */
public class FirstHalf {
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 
//
//FirstHalf("WooHoo") -> "Woo"
//FirstHalf("HelloThere") -> "Hello"
//FirstHalf("abcdef") -> "abc"

    public String firstHalf(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.delete(str.length()/2, str.length());
        return sb.toString();
    }
}
