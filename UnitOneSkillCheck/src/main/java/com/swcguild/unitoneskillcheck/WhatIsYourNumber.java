/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.unitoneskillcheck;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WhatIsYourNumber {

    public static void main(String[] args) {
        int userNum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select a random number to print out: ");
        userNum = sc.nextInt();

        for (int i = 0; i < userNum + 1; i++) {
            System.out.println(i);
        }

        System.out.println("\nThank you for playing!");
    }
}
