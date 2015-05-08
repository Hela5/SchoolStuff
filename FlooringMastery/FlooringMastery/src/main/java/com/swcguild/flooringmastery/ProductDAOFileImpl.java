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
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class ProductDAOFileImpl implements ProductDAO {

    ConsoleIO cons = new ConsoleIO();
    public final String PRODUCTS = "Products.txt";
    public final static String DELIMITER = ",";

    private HashMap<String, Product> productInfo = new HashMap<>();

    public void loadProductInfo() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(PRODUCTS)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Product currentProductDTO = new Product();
            currentProductDTO.setProductType(currentTokens[0].toUpperCase());
            currentProductDTO.setCostPSF(Double.parseDouble(currentTokens[1]));
            currentProductDTO.setLaborCostPSF(Double.parseDouble(currentTokens[2]));
            productInfo.put(currentProductDTO.getProductType(), currentProductDTO);
        }
        sc.close();

    }

    @Override
    public ArrayList getProductTypes() {
        Set<String> listofProducts = productInfo.keySet();
        ArrayList<String> list = new ArrayList<>();
        list.addAll(listofProducts);
        return list;

    }

    @Override
    public double getCostPSF(String productType) {
        Product prod = new Product();
        prod = productInfo.get(productType);
        return prod.getCostPSF();
    }

    @Override
    public double getLaborCostPSF(String productType) {
        Product prod = new Product();
        prod = productInfo.get(productType);
        return prod.getLaborCostPSF();

    }
//        Tax tDTO = new Tax();
//        tDTO = taxRate.get(state);
//        return tDTO.getTaxRate();
}
