/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.forloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CountingMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a number you'd like to Counting Machine to count to: ");
        int userNum = sc.nextInt();

        for (int i = 1; i < userNum + 1; i++) {
            System.out.print(i + " ");
        }
    }
}
