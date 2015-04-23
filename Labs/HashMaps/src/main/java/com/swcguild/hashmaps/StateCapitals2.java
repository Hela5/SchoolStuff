/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.hashmaps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class StateCapitals2 {

    public static void goCity() {
        HashMap<String, Capital> statesAndCapitals = new HashMap<>();

        Capital annapolis = new Capital();
        annapolis.setName("Annapolis");
        annapolis.setPopulation(20000);
        annapolis.setSqMileage(600000);

        Capital columbus = new Capital();
        columbus.setName("Columbus");
        columbus.setPopulation(50000);
        columbus.setSqMileage(40000);

        Capital albany = new Capital();
        albany.setName("Albany");
        albany.setPopulation(3000);
        albany.setSqMileage(25000);

        statesAndCapitals.put("New York", albany);
        statesAndCapitals.put("Ohio", columbus);
        statesAndCapitals.put("Maryland", annapolis);

        Set<String> stateSet = statesAndCapitals.keySet();
        for (String stateKey : stateSet) {
            Capital capital = new Capital();
            capital = statesAndCapitals.get(stateKey);
            System.out.println(stateKey + ", " + capital.getName() + ", " + capital.getPopulation() + ", " + capital.getSqMileage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("What's the minimum size population city are you looking for? ");
        int sizePop = sc.nextInt();
        for (String stateKey : stateSet) {
            Capital capital = new Capital();
            capital = statesAndCapitals.get(stateKey);
            if (sizePop < capital.getPopulation()) {
                System.out.println(stateKey + ", " + capital.getName() + ", " + capital.getPopulation() + ", " + capital.getSqMileage());
            }

        }
    }
}
