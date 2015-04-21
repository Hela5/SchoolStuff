/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.unitoneskillcheck;

/**
 *
 * @author apprentice
 */
public class AreTheyTrue {

    public static void main(String[] args) {
        Boolean firstBoolRun = true;
        Boolean secondBoolRun = true;
        String areTrue = "";
        areTrue = howTrue(firstBoolRun, secondBoolRun);
        System.out.println(areTrue);
        
        Boolean secondRun = false;
        Boolean secondRun2 = false;
        areTrue = howTrue(secondRun, secondRun2);
        System.out.println(areTrue);
        
        Boolean thirdRun = true;
        Boolean thirdRun2 = false;
        areTrue = howTrue(thirdRun, thirdRun2);
        System.out.println(areTrue);
        
        Boolean fourthRun = false;
        Boolean fourthRun2 = true;
        areTrue = howTrue(fourthRun, fourthRun2);
        System.out.println(areTrue);
    }

    public static String howTrue(Boolean firstBool, Boolean secondBool) {
        String ifTrue = "";
        
        if (firstBool && secondBool ) {
            ifTrue = "BOTH";
        } else if (firstBool || secondBool) {
            ifTrue = "ONLY ONE";
        } else if (!firstBool && !secondBool) {
            ifTrue = "NEITHER";
        }   return ifTrue;
    } 
}