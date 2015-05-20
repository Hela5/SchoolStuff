package com.swcguild.stringjunitdrills;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apprentice
 */
public class TweakFront {
//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length.
//TweakFront("Hello") -> "llo"
//TweakFront("away") -> "aay"
//TweakFront("abed") -> "abed"

    public String TweakFront(String str) {
        StringBuilder build = new StringBuilder();
        build.append(str);
        int num = 0;

        if (!Character.toString(build.charAt(0)).equals("a")) {
            build.deleteCharAt(0);
            num = -1;
        }
        if (!Character.toString(build.charAt(1 + num)).equals("b")) {
            build.deleteCharAt(1 + num);
        }
        return build.toString();

    }
}
