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
public class MagicalSword extends Sword implements MagicalItem {
    
    @Override//base class or interface has already defined this
    public String getItemName() {
        return "Magical Sword";
    }
    
    @Override
    public int getItemSpellPower() {
        return 10;
    }
    
    
    
}
