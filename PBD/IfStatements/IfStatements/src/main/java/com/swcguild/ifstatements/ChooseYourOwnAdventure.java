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
public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        String forestAns = "", hillAns = "", backAns = "", raccoonTime = "", waterAlong = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO MICHELL'S TINY ADVENTURE!");
        System.out.println("You are walking in the forest. Would you like to continue on the 'path' or venture off on your 'own'?");
        forestAns = sc.nextLine();
        if (forestAns.equals("path")) {
            System.out.println("We continue on beaten path.");
            System.out.println("As you're coming up to the trail map, you see your friends. \nThey are hatching a plan for the afternoon. \nWould you like to continue on your 'original' plan or join the 'friend' fun?");
            hillAns = sc.nextLine();
            if (hillAns.equals("original")) {
                System.out.println("As you keep walking you encounter a raccoon. \nDo you 'run' or 'growl' to scare it away?");
                raccoonTime = sc.nextLine();
                if (raccoonTime.equals("run")) {
                    System.out.println("Run fast, he might catch you!");
                } else {
                    System.out.println("What an intimdating human you are. \nYou just scared away a baby raccoon.");
                }
            } else {
                System.out.println("Yay. Friends! Want to grab pizza after? Yes or No?");
            }
        } else if (forestAns.equals("own")) {
            System.out.println("Blaze that trail, friend. \nWe come across a gurgling stream. \nDid you remember to bring water? Yes or No?");
            waterAlong = sc.nextLine();
            if (waterAlong.equals("Yes")) {
                System.out.println("Preparedness! Take a sip. \nNow watch out for that Bear!");
            } else {
                System.out.println("Bummer. You can take a sip from the stream. I don't see any factoriess nearby...");
            }
        }

    }

}
