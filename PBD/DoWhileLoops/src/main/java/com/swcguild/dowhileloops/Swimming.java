/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dowhileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Swimming {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS";

        double minimumTemperature = 79.0;
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        System.out.println("What is the current water temperature? ");
        currentTemperature = sc.nextDouble();
        savedTemperature = currentTemperature;

        System.out.println("\nOkay, so the current water temperature is " + currentTemperature + " F. ");
        System.out.println(swimmer1 + " approaches the lake..");

        swimTime = 0;
        while (currentTemperature >= minimumTemperature) {
            System.out.println("\t" + swimmer1 + " swims for a bit.");
            swimTime++;
            System.out.println(" Swim time: " + swimTime + " min.");
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println("\tThe current water temperature is now " + currentTemperature + " F.");
        }
        System.out.println(swimmer1 + " stops swimming. Total swim time: " + swimTime + " min.");
        
        currentTemperature = savedTemperature;
        
        System.out.println("\nOkay, so the current water temperature is " + currentTemperature + " F.");
        System.out.println(swimmer2 + "approaches the lake...");
        
        swimTime = 0;
        do {
            System.out.println("\t" + swimmer2 + " swims for a bit.");
            swimTime++;
            System.out.println(" Swim time: " + swimTime + " min.");
            Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println("\tThe current water temperature is now " + currentTemperature + " F.");
        } while ( currentTemperature >= minimumTemperature);
        
        System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime + " min.");
        
    }
}
