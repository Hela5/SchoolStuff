/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.dao;

import com.swcguild.addressbook2.dto.Address;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class AddressBookDAOFileImpl implements AddressBookDAO {

    Map<Integer, Address> addresses = new HashMap<>();
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
            addresses.put(currentAddress.getiD(), currentAddress);
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

        for (int i = 0; i < addresses.size(); i++) {
            out.println(this.getAddress(i).getiD() + DELIMITER
                    + this.getAddress(i).getFirstName() + DELIMITER
                    + this.getAddress(i).getLastName() + DELIMITER
                    + this.getAddress(i).getStreetAddress() + DELIMITER
                    + this.getAddress(i).getCity() + DELIMITER
                    + this.getAddress(i).getState() + DELIMITER
                    + this.getAddress(i).getZipCode());

            out.flush();
        }
        out.close();

    }

    @Override
    public void addAddress(Address address) {
        if (address.getiD() == -1) {
            address.setiD(iD++);
        }
        addresses.put(address.getiD(), address);
    }

    @Override
    public Address removeAddress(Integer iD) {
        return addresses.remove(iD);
    }

    @Override
    public Address getAddress(Integer iD) {
        return addresses.get(iD);
    }

    @Override
    public List<Address> displayAddresses() {
//        Collection<Address> listAddresses = addresses.values();
//        ArrayList<Address> aList = new ArrayList<>();
//        aList.addAll(addresses);
//        return aList;    
        return addresses.values()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public void editAddress(Integer iD, Address address) {
        getAddress(iD);
        addresses.replace(iD, address);
    }

    @Override
    public List<Address> getAddress(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numAddress() {
        return addresses.size();
    }

    @Override
    public List<Address> searchByCity(String city) {
        return addresses.values()
                .stream()
                .filter(s -> s.getCity().equals(city))
                .collect(Collectors.toList());

    }

    @Override
    public Map<String, List<Address>> searchByState(String state) {
        return addresses.values()
                .stream()
                .filter(s -> s.getState().equals(state))
                .collect(Collectors.groupingBy(Address::getCity));

    }

    @Override
    public List<Address> searchByZipCode(int zipCode) {
        return addresses.values()
                .stream()
                .filter(s -> s.getZipCode() == zipCode)
                .collect(Collectors.toList());

    }

}
