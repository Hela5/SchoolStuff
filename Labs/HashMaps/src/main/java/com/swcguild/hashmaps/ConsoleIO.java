/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hashmaps;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    public static int queryUserInt(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextInt();
    }

    public static int queryUserIntRange(String queryMessage, int inputMin, int inputMax) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        int response = sc.nextInt();
        while (response < inputMin && response > inputMax) {
            System.out.println("Looks like you are out of range, try again!");
            System.out.println("Please stay within " + inputMin + " and " + inputMax + ".");
            System.out.println(queryMessage);
            response = sc.nextInt();
        }
        return response;
    }

    public static String queryUserString(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextLine();
    }

    public static float queryUserFloat(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextFloat();
    }

    public static float queryUserFloat(String queryMessage, float inputMin, float inputMax) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        float response = sc.nextFloat();
        while (response < inputMin && response > inputMax) {
            System.out.println("Looks like you are out of range, try again!");
            System.out.println("Please stay within " + inputMin + " and " + inputMax + ".");
            System.out.println(queryMessage);
            response = sc.nextFloat();
        }
        return response;
    }
    
    public static double queryUserDouble(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextDouble();
    }
    
    public static double queryUserDouble(String queryMessage, double inputMin, double inputMax) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        double response = sc.nextDouble();
        while (response < inputMin && response > inputMax) {
            System.out.println("Looks like you are out of range, try again!");
            System.out.println("Please stay within " + inputMin + " and " + inputMax + ".");
            System.out.println(queryMessage);
            response = sc.nextDouble();
        }
        return response;
    }
    
    public static void displayUserString(String userMessage){
        System.out.println(userMessage);    
    }
}
