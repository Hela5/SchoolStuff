/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arrays;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BasicArrays3 {
    public static void main(String[] args) {
        int[] longArray = new int[1000];
        Random r = new Random();
        int randomNum = 0;
        
        for (int i = 0; i < longArray.length; i++) {
            randomNum = 10 + r.nextInt(99); 
            System.out.println(randomNum + "  ");
            
        }  
    }
    
}
