/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arrays;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GradesInArrayAndFile {

    public static void main(String[] args) throws Exception {
        String wholeName = "";
        String fileName = "";
        int[] grade = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("First and Last Name, please: ");
        wholeName = sc.nextLine();
        System.out.println("File name: ");
        fileName = sc.nextLine();

        System.out.println("Here are your randomly generated grades for your classes. Hope you pass!");
        for (int i = 1; i < grade.length; i++) {
            Random r = new Random();
            int randomNum = 1 + r.nextInt(100);
            System.out.println("Grade " + i + " " + randomNum);
        }
        
        PrintWriter out = new PrintWriter(new FileWriter(fileName));
    }

}
