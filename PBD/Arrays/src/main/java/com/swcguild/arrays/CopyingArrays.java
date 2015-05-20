/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arrays;

/**
 *
 * @author apprentice
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] origArray = new int[10];
        origArray[0] = 3;
        origArray[1] = 12;
        origArray[2] = 13;
        origArray[3] = 14;
        origArray[4] = 15;
        origArray[5] = 56;
        origArray[6] = 17;
        origArray[7] = 18;
        origArray[8] = 34;
        origArray[9] = 65;
               
        int[] cloneArray = new int[10];
        cloneArray = origArray.clone();
        origArray[9] = -7;
        
        for (int i = 0; i <origArray.length; i++) {
            System.out.println(origArray[i]);
        }
        for (int i = 0; i <cloneArray.length; i++){
            System.out.println(cloneArray[i]);
        }
            
    }
}
