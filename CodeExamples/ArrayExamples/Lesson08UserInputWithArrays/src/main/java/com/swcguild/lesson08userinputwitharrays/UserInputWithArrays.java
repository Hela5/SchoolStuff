/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.lesson08userinputwitharrays;

import java.util.Scanner;

/**
 *
 * @author ilyagotfryd
 */
public class UserInputWithArrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] userInputs = new int[10];
        
        System.out.println("Please enter 10 values:");
        
        for(int i=0;i<userInputs.length;i++)
        {
            System.out.println("Please enter value[" + (i+1) + "]:");
            userInputs[i] = sc.nextInt();
        }
        
        int min = userInputs[0];
        int max = userInputs[0];
        int total = 0;
        
        System.out.print("[ ");
        for(int num: userInputs)
        {
            if(num>max) max = num;
            if(num<min) min = num;
            total += num;
            System.out.print(num + " ");
        }
        System.out.println("]");
        
        System.out.println("Min: " + min + " Max: " + max + " Average: " + (double) total/userInputs.length);
    }
}
