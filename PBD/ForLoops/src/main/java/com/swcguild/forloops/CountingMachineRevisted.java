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
public class CountingMachineRevisted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a number you'd like to Counting Machine to begin with: ");
        int userNumBeginning = sc.nextInt();
        System.out.print("What number shall we end with? ");
        int userNumEnding = sc.nextInt();
        System.out.print("Counting by? ");
        int countInterval = sc.nextInt();

        for (int i = userNumBeginning; i < userNumEnding + 1; i += countInterval) {
            System.out.print(i + " ");
        }
    }
}
