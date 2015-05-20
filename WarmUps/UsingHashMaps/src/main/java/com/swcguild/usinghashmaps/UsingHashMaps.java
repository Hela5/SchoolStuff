/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.usinghashmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class UsingHashMaps {
//    
//Using HashMaps
//
//Pair up to write code that does the following (this can all be in a main method):
//Create a HashMap that will be used to keep track of how many points each player on a team scores in a particular game.  Keys should be of type String and values of type Integer.
//Add the following stats to the map:
//Smith - 23 points
//Jones - 12 points
//Jordan - 45 points
//Pippen - 32 points
//Kerr - 15 points
//Print each players name and associated point total
//Calculate the average points per game for the team and print it to the screen

    public static void main(String[] args) {
        HashMap<String, Integer> playerPoints = new HashMap<>();

        playerPoints.put("Smith", 23);
        playerPoints.put("Jones", 12);
        playerPoints.put("Jordan", 45);
        playerPoints.put("Pippin", 32);
        playerPoints.put("Kerr", 15);

        Set<String> playerNames = playerPoints.keySet();
        for (String currentPlayer : playerNames) {
            Integer currentPoints = playerPoints.get(currentPlayer);
            System.out.println(currentPlayer + " " + currentPoints);
        } //gets the key and is able to print the values associated with that specific key!! 

//        Collection<Integer> points = playerPoints.values();
//        for (Integer currentPoint : points) {
//            System.out.println(currentPoint);
//        }
        ///for (int   = 0 , i < playerPoint;
        //i++
        
        
    

) {
        
    }
    }
}
