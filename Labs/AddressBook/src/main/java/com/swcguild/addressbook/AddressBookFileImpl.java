/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AddressBookFileImpl implements AddressDAO {
//    ConsoleIO cons = new ConsoleIO();

    HashMap<Integer, Address> addressB = new HashMap<>();
    public static final String ADDRESSBOOK_FILE = "addBk.txt";
    public static final String DELIMITER = "::";
    int iD = 0;

    @Override
    public void loadAddresses() throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ADDRESSBOOK_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Address currentAddress = new Address();
            currentAddress.setiD(Integer.parseInt(currentTokens[0]));
            currentAddress.setFirstName(currentTokens[1]);
            currentAddress.setLastName(currentTokens[2]);
            currentAddress.setStreetAddress(currentTokens[3]);
            currentAddress.setCity(currentTokens[4]);
            currentAddress.setState(currentTokens[5]);
            currentAddress.setZipCode(Integer.parseInt(currentTokens[6]));
            addressB.put(currentAddress.getiD(), currentAddress);
            if (currentAddress.getiD() > iD) {
                    iD = currentAddress.getiD();
            }
        }
        sc.close();
        iD++;

    }

    @Override
    public void writeAddresses() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(ADDRESSBOOK_FILE));

        for (int i = 0; i < addressB.size(); i++) {
            out.println(this.getAddress(i).getiD() + DELIMITER 
                    + this.getAddress(i).getFirstName() + DELIMITER
                    + this.getAddress(i).getLastName() + DELIMITER
                    + this.getAddress(i).getStreetAddress() + DELIMITER
                    + this.getAddress(i).getCity() + DELIMITER
                    + this.getAddress(i).getState() + DELIMITER
                    + this.getAddress(i).getZipCode());

            out.flush();
        } out.close();

    }

    @Override
    public void addAddress(Address address) {
        address.setiD(this.iD);
        addressB.put(this.iD, address);
        iD++;
        System.out.println(this.iD);

    }

    @Override
    public Address removeAddress(Integer iD) {
        return addressB.remove(iD);
    }

    @Override
    public Address getAddress(Integer iD) {
        return addressB.get(iD);
    }

    @Override
    public ArrayList displayAddresses() {
        Collection<Address> addresses = addressB.values();
        ArrayList<Address> aList = new ArrayList<>();
        aList.addAll(addresses);
        return aList;
    }

    @Override
    public void editAddress(Integer iD, Address newAddress) {
        getAddress(iD);
        addressB.replace(iD, newAddress);
    }

    @Override
    public ArrayList getAddress(String lastName) {
        ArrayList<Address> list = new ArrayList<>();
        Collection<Address> add = addressB.values();
        for (Address currentAddress : add) {
            String theseNames = currentAddress.getLastName();
            if (theseNames.equals(lastName)) {
                list.add(currentAddress);
            }
        }
        return list;
    }

    @Override
    public int numAddress() {
        return addressB.size();
    }

}
