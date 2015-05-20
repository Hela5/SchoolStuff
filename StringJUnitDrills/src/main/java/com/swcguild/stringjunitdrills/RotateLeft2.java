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
public class RotateLeft2 {
//    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2. 
//
//Rotateleft2("Hello") -> "lloHe"
//Rotateleft2("java") -> "java"
//Rotateleft2("Hi") -> "Hi"

    public String rotateleft2(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str, 2, str.length());
        sb.append(str, 0, 2);
       
        return sb.toString();

    }
}
