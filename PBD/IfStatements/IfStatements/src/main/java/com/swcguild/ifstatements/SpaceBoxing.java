/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SpaceBoxing {

    public static void main(String[] args) {
        double earthWeight = 0, spaceWeight = 0, fightPlanet = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hello, Champ! Please enter your current Earth weight?");
        earthWeight = sc.nextFloat();

        System.out.println("Now, please select which planet you're having your next fight on:");
        System.out.println(" #     Planet     ");
        System.out.println(" 1     Venus      ");
        System.out.println(" 2     Mars       ");
        System.out.println(" 3     Jupiter    ");
        System.out.println(" 4     Saturn     ");
        System.out.println(" 5     Uranus     ");
        System.out.println(" 6     Neptune    ");
        fightPlanet = sc.nextDouble();

        if (fightPlanet == 1) {
            spaceWeight = earthWeight * 0.78;
            System.out.println("Your weight would be " + spaceWeight + " pounds on that planet");
        } else if (fightPlanet == 2) {
            spaceWeight = earthWeight * 0.39;
            System.out.println("Your weight would be " + spaceWeight + " pounds on that planet");
        } else if (fightPlanet == 3) {
            spaceWeight = earthWeight * 2.65;
            System.out.println("Your weight would be " + spaceWeight + " pounds  on that planet");
        } else if (fightPlanet == 4) {
            spaceWeight = earthWeight * 1.17;
            System.out.println("Your weight would be " + spaceWeight + " pounds  on that planet");
        } else if (fightPlanet == 5) {
            spaceWeight = earthWeight * 1.05;
            System.out.println("Your weight would be " + spaceWeight + " pounds  on that planet");
        } else if (fightPlanet == 6) {
            spaceWeight = earthWeight * 1.23;
            System.out.println("Your weight would be " + spaceWeight + " pounds  on that planet");
        }

    }
}
