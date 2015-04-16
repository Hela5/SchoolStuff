/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.keyboardinput;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MoreUserInput {

    public static void main(String[] args) {
        String firstName = "";
        String lastName = "";
        byte grade = 0;
        float idNumber = 0;
        String loginName = "";
        float gpa = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the following information so I can see it for a profit!");

        System.out.println("First name:");
        firstName = keyboard.nextLine();

        System.out.println("Last name:");
        lastName = keyboard.nextLine();

        System.out.println("Grade (9-12):");
        grade = keyboard.nextByte();

        System.out.println("Student ID:");
        idNumber = keyboard.nextFloat();

        System.out.println("Login:");
        loginName = keyboard.next();

        System.out.println("GPA (0.0-4.0)");
        gpa = keyboard.nextFloat();

        System.out.println("Your Information:");
        System.out.println("Login:" + loginName);
        System.out.println("ID:" + idNumber);
        System.out.println("Name:" + lastName + "," + firstName);
        System.out.println("GPA:" + gpa);
        System.out.println("Grade:" + grade);
    }
}
