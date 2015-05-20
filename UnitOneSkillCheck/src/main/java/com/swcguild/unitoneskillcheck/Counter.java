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
public class Counter {

    public static void main(String[] args) {
        int count = to10(10);      
        System.out.println(count);
        System.out.println("\n");
        
        count = to10(3);
        System.out.println(count);
        System.out.println("\n");
        
        count = to10(8);
        System.out.println(count);
        System.out.println("\n");
        
        to10(200);
        System.out.println("\n");
    }

    public static void to10(int j) {
        int i = 0;
        for (i = 0; i < j; i++) {
            System.out.println(i);
        }
    }
}
// can't figure out how to implement the method when it has no parameters 
// unsure of why to set a method to non-static and how
// did I read the specs right of the assignment? totally confused but this is outputting numbers...