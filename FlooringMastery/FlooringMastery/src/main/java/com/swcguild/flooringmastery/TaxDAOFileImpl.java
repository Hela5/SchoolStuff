/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmastery;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TaxDAOFileImpl implements TaxDAO {
    ConsoleIO cons = new ConsoleIO();
    public final String TAXES = "Taxes.txt";
    public final static String DELIMITER = ",";

    private HashMap<String, Double> taxRate = new HashMap<>();

    public void loadTaxInfo() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(TAXES)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
//            Tax currentTaxDTO = new Tax();
//            currentTaxDTO.setState(currentTokens[0]);
//            currentTaxDTO.setTaxRate(Double.parseDouble(currentTokens[1]));
//            taxRate.put(currentTaxDTO.getState(), currentTaxDTO);
            taxRate.put(currentTokens[0].toUpperCase(), Double.parseDouble(currentTokens[1]));
        }
        sc.close();

    }

    @Override
    public Double getTaxRate(String state) {
//        Tax tDTO = new Tax();
//        tDTO = taxRate.get(state);
//        return tDTO.getTaxRate();
        return taxRate.get(state);
        
//        String rate = taxRate.get(state);
        
        
        

    }

    @Override
    public ArrayList getStates() {
        Collection<String> orderList = taxRate.keySet();
        ArrayList<String> list = new ArrayList<>();
        list.addAll(orderList);
       return list;
    }

}
