/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logicjunitdrills;

/**
 *
 * @author apprentice
 */
public class Mod20 {
// Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod 
//
//Mod20(20) → false
//Mod20(21) → true
//Mod20(22) → true

public boolean Mod20(int n) {
  if (n >= 0) {
      if (n % 20 == 1 || n % 20 == 2) {
          return true;
      }
  } return false;
}   
}
