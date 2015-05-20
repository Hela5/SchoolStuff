/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.rpgsatchel;

/**
 *
 * @author apprentice
 */
public class Shield implements Item {

    private String name;
    private int weight;

    public Shield(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getItemName() {
        return this.name;
    }

    @Override
    public int getItemWeight() {
        return this.weight;
    }
    
    public void block() {
        System.out.println("Blocking...");
    }
}
