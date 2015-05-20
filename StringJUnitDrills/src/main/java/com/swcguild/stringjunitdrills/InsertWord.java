/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.stringjunitdrills;

import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author apprentice
 */
public class InsertWord {
//    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
//
//Hint: Substrings are your friend here 
//
//InsertWord("<<>>", "Yay") -> "<<Yay>>"
//InsertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
//InsertWord("[[]]", "word") -> "[[word]]"

public String insertWord(String container, String word) {
    return container.substring(0, 1) + word + container.substring(2, 3);

}
}
