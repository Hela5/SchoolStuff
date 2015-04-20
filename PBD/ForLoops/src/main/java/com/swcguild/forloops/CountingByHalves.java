/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.forloops;

/**
 *
 * @author apprentice
 */
public class CountingByHalves {

    public static void main(String[] args) {
        for (float i = -10; i <= 10; i += 0.5) {
            System.out.print(i);
            for (float j = i * i; j < i * i + 1; j++) {
                System.out.print("\t" + j);
                System.out.println(" ");
            }
        }
    }
}
