/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.iteration2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class Iteration2 {

    public static void main(String[] args) {
        HashMap<String, String> teams = new HashMap<>();

        teams.put("Cleveland", "Browns");
        teams.put("Pittsburgh", "Steelers");
        teams.put("Cincinnati", "Bengals");
        teams.put("Minneapolis", "Vikings");
        teams.put("Kansas City", "Chiefs");

        Set<String> city = teams.keySet();
        for (String currentTeam : city) {
            System.out.println(currentTeam + " " + teams.get(currentTeam));
        }

        System.out.println("-------------");
        Iterator<String> it = city.iterator();
        while (it.hasNext()) {
            String currentCity = it.next();
            System.out.println(currentCity + " " + teams.get(currentCity));
        }

        System.out.println("-------------");
        Set<Entry<String, String>> mapEntries = teams.entrySet();
        for (Entry<String, String> currentEntry : mapEntries) {
            System.out.println(currentEntry.getKey() + " " + currentEntry.getValue());
        }
        
//        for (HashMap.Entry<String, String> entry : teams.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

    }

}
