/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOps math = new MathOps();
        int operand1 = 0, operand2 = 0;
        byte operation = 0;
        boolean exit = false;

        System.out.println("Welcome to our Simple Calculator!");

        while (exit == false) {
            System.out.println("Please make a selection from the following: ");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction ");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("5 - Exit");
            operation = sc.nextByte();

            if (operation == 5) {
                exit = true;
                System.out.println("Thank you for playing!");
            } else {

                System.out.print("Please choose a random number: ");
                operand1 = sc.nextInt();
                System.out.print("Please choose a second random number: ");
                operand2 = sc.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("The result is " + math.add(operand1, operand2) + "\n");
                        break;
                    case 2:
                        System.out.println("The result is " + math.subract(operand1, operand2) + "\n");
                        break;
                    case 3:
                        System.out.println("The result is " + math.multiply(operand1, operand2) + "\n");
                        break;
                    case 4:
                        System.out.println("The result is " + math.divide(operand1, operand2) + "\n");
                        break;
                    default:
                        System.out.println("Trying re-reading the menu!!");
                }

            }
        }
    }
}
