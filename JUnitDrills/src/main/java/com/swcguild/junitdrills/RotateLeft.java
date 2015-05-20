/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.junitdrills;

/**
 *
 * @author apprentice
 */
public class RotateLeft {
//Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//RotateLeft({1, 2, 3}) -> {2, 3, 1}
//RotateLeft({5, 11, 9}) -> {11, 9, 5}
//RotateLeft({7, 0, 0}) -> {0, 0, 7}

public int[] rotateLeft(int[] numbers) {
  int[] a = numbers;
  int[] b = new int[numbers.length];
  System.arraycopy(a, 1, b, 0, a.length - 1);
  b[a.length - 1] = a[0];
  a = b;
    return b;
    }
}

