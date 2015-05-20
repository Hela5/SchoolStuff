/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arraylisthashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("This is string one");
        myList.add("This is string two");
        myList.add("This is string three");

        String myString = myList.get(1);
        System.out.println(myString);

//        myList.remove(1);
//        myString = myList.get(1);
//        System.out.println(myString);
        //iterate through my ArrayList using a classic For Loop
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        
        //iterate through my ArrayList using an Enhanced For Loop
        
        for (String currentString : myList) {
            System.out.println(currentString);
        }
        
        //iterate through ArrayList using an Iterator and a While Loop
        
       Iterator<String> iter = myList.iterator();
       while(iter.hasNext()) {
           String currentString = iter.next();
           System.out.println(currentString);
       }
       
        System.out.println("+++++++++++++++_______++++++++++++++++");
        
        
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Java", "A great programming language.");
        myMap.put("Akron", "Where we are.");
        myMap.put("Browns", "A football team from Cleveland.");
        
        String whereAreWe =myMap.get("Akron");
        System.out.println(whereAreWe);
        
        String testString = myMap.get("Columbus");
        System.out.println(testString);
        
        boolean hasKey = myMap.containsKey("Columbus");
        System.out.println(hasKey);
        
        //get the key set and list all the things in the map
        Set<String> myKeys = myMap.keySet();
        for (String currentKey : myKeys ) {
            System.out.println(currentKey);
        }
        
        //get all values in map and list them
        Collection<String> values = myMap.values();
        for (String currentValue : values ) {
            System.out.println(currentValue);
        }
    }
}
