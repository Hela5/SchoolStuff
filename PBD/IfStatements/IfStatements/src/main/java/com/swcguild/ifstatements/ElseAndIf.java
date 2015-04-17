/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.ifstatements;

/**
 *
 * @author apprentice
 */
public class ElseAndIf {
    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        if ( cars > people ) {
            System.out.println("We should take the cars");
        } else if ( cars < people ) {
            System.out.println("We should not take the cars.");
        }
//        } //else { 
//            System.out.println("We can't decide.");
//        }
        
        if ( buses > cars ) {
            System.out.println("That's too many buses.");
        } else if ( buses < cars ) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }
        
        if ( people > buses ) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }
    }
}
// else if and else have the jobs of following up with code if the original condition proved false, they are the second and third checks for true, if nothing is true then the last else will be printed.

// commenting out the else statement didn't effect the end result since the first if condition was true.