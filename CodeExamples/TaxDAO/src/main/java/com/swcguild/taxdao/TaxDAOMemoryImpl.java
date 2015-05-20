/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.taxdao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class TaxDAOMemoryImpl implements TaxDAO {

    private Map<String, Double> taxRate;
    
    public TaxDAOMemoryImpl() {
        taxRate = new HashMap<>();
        
        taxRate.put("OH", 6.25);
        taxRate.put("MI", 5.75);
        taxRate.put("PA", 6.5);
    }
    
    @Override
    public Double getRate(String state) {
        return taxRate.get(state);
    }

    @Override
    public ArrayList<String> getStates() {
        Set<String> states = taxRate.keySet();
        return new ArrayList<String>(states);
    }

}
