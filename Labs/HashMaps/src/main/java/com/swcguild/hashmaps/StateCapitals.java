/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hashmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class StateCapitals {

    public static void run() {

        HashMap<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Ohio", "Columbus");
        stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("Kansas", "Kansas City");
        stateCapitals.put("Virginia", "Richmond");

        Set<String> state = stateCapitals.keySet();
        for (String stateNames : state) {
            System.out.println(stateNames);
        }
        
        Collection<String> capital = stateCapitals.values();
        for (String cityNames : capital) {
            System.out.println(cityNames);
        }
        
          for (String stateNames : state) {
            System.out.println(stateNames + " , " + stateCapitals.get(stateNames));
        }

    }
}
