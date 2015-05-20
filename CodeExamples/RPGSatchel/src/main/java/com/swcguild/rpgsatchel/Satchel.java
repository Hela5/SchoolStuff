/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rpgsatchel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class Satchel {

    private int weightLimit;
    private int currentWeight = 0;

    Map<String, Item> itemMap = new HashMap<>();

    public Satchel(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public boolean addToSatchel(Item item) {
        if ((item.getItemWeight() + this.currentWeight) > this.weightLimit) {
            return false;
        } else {
            currentWeight += item.getItemWeight();
            itemMap.put(item.getItemName(), item);
            return true;
        }
    }

    public Item removeFromSatchel(String itemName) {
        Item temp = itemMap.remove(itemName);
        if (temp != null) {
            currentWeight -= temp.getItemWeight();
        } return temp;
    }
    
    public List<String> listItemsInSatchel() {
        Set<String> itemNames = itemMap.keySet();
        List<String> itemNameList = new ArrayList<>(itemNames);
        return itemNameList;
    }
}
