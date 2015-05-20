/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.consoleio;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    public int queryUserInt(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextInt();
    }

    public int queryUserIntRange(String queryMessage, int inputMin, int inputMax) {
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

    public String queryUserString(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextLine();
    }

    public float queryUserFloat(String queryMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(queryMessage);
        return sc.nextFloat();
    }

    public float queryUserFloat(String queryMessage, float inputMin, float inputMax) {
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

    public double queryUserDouble(String queryMessage) {
        double num = 0.0;
        boolean exxx;
        do {
            exxx = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(queryMessage);
                num = sc.nextDouble();
            } catch (Exception e) {
                exxx = true;
            }
        } while (exxx);
        return num;

    }

    public double queryUserDouble(String queryMessage, double inputMin, double inputMax) {
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

    public void displayUserString(String userMessage) {
        System.out.println(userMessage);
    }
    
    public void displayUserInt(int userMessage) {
        System.out.println(userMessage);
    }
}
