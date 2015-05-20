/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.gamebot;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class GameBot {

    Map<String, Game> games = new HashMap<>();
    
    public String displayMenu() {
        System.out.println("Welcome to the GameBot of 2015!");
        System.out.println("Here's our current list of games: ");
       
        Set<Map.Entry<String, Game>> mapEntries = games.entrySet();
        for (Map.Entry<String, Game> currentGame : mapEntries) {
            System.out.println(currentGame.getKey());
        }
        
        String choice = System.out.println("Which would you like to play today?");
        
        
    }
    
    
    public void run(String gameName) {

    }

}
