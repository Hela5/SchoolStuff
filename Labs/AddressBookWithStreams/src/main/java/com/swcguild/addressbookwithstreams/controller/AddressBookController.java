/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbookwithstreams.controller;

import com.swcguild.addressbookwithstreams.dao.AddressBookDAO;
import com.swcguild.addressbookwithstreams.dao.AddressBookDAOFileImpl;
import com.swcguild.addressbookwithstreams.dto.Address;
import com.swcguild.consoleio.ConsoleIO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class AddressBookController {

    ConsoleIO cons = new ConsoleIO();
    AddressBookDAO dao = new AddressBookDAOFileImpl();

    public void run() throws Exception {
        dao.loadAddresses();
        int userChoice = 0;

        do {
            displayMenu();
            userChoice = cons.queryUserInt("Please choose from the above options.");
            switch (userChoice) {
                case 1:
                    addServer();
                    break;
                case 2:
                    editAddress();
                    break;
                case 3:
                    removeAddress();
                    break;
                case 4:
                    countAddresses();
                    break;
                case 5:
                    returnAllAddresses();
                    break;
                case 6:
                    findAddress();
                    break;
                case 7:
                    searchByCity();
                    break;
                case 8:
                    searchByState();
                    break;
                case 9:
                    searchByZipCode();
                    break;
                case 10:
                    cons.displayUserString("Exiting program...");
                    break;
                default:
                    cons.displayUserString("Not a valid option, please try again.");
            }
        } while (userChoice != 10);
        dao.writeAddresses();
    }

    private void displayMenu() {
        cons.displayUserString("********************************");
        cons.displayUserString("  Welcome to your Address Book  ");
        cons.displayUserString("********************************");
        cons.displayUserString("                                ");
        cons.displayUserString("1)  Add an address              ");
        cons.displayUserString("2)  Edit an entry               ");
        cons.displayUserString("3)  Remove an entry             ");
        cons.displayUserString("4)  Count all addresses         ");
        cons.displayUserString("5)  Return all addresses        ");
        cons.displayUserString("6)  Find an address             ");
        cons.displayUserString("7)  Search addresses by City    ");
        cons.displayUserString("8)  Search addresses by State   ");
        cons.displayUserString("9)  Search addresses by ZipCode ");
        cons.displayUserString("10) Exit Program                ");
        cons.displayUserString("                                ");
        cons.displayUserString("********************************");
    }

    private void addServer() {
        String firstName = cons.queryUserString("Please enter the first name: ");
        String lastName = cons.queryUserString("Enter the last name: ");
        String streetAddress = cons.queryUserString("Enter the street address: ");
        String city = cons.queryUserString("Enter city:");
        String state = cons.queryUserString("Enter state:");
        int zipCode = cons.queryUserInt("Enter the zip code:");
        Address currentAddress = new Address();
        currentAddress.setFirstName(firstName);
        currentAddress.setLastName(lastName);
        currentAddress.setStreetAddress(streetAddress);
        currentAddress.setCity(city);
        currentAddress.setState(state);
        currentAddress.setZipCode(zipCode);
        dao.addAddress(currentAddress);
        cons.displayUserString("\nEntering new address...\n");
    }

    private void editAddress() {
        findAddress();
        int key = cons.queryUserInt("Enter ID of entry to be edited.");
        Address temp = dao.getAddress(key);
        String newFirstName;
        String newLastName;
        String newStreetAddress;
        String newCity;
        String newState;
        int newZip;
        boolean stillEditing = true;
        do {
            cons.displayUserString("Fields to edit:");
            cons.displayUserString("---------------");
            cons.displayUserString("1) First Name");
            cons.displayUserString("2) Last Name");
            cons.displayUserString("3) Street Address");
            cons.displayUserString("4) City");
            cons.displayUserString("5) State");
            cons.displayUserString("6) Zipcode");
            cons.displayUserString("7) Return to main menu");
            int field = cons.queryUserInt("Which field would you like to edit?");

            switch (field) {
                case 1:
                    newFirstName = cons.queryUserString("Please enter new first name:");
                    temp.setFirstName(newFirstName);
                    break;
                case 2:
                    newLastName = cons.queryUserString("Enter new last name:");
                    temp.setLastName(newLastName);
                    break;
                case 3:
                    newStreetAddress = cons.queryUserString("Enter new street address:");
                    temp.setStreetAddress(newStreetAddress);
                    break;
                case 4:
                    newCity = cons.queryUserString("Enter new city:");
                    temp.setCity(newCity);
                    break;
                case 5:
                    newState = cons.queryUserString("Enter new state:");
                    temp.setState(newState);
                    break;
                case 6:
                    newZip = cons.queryUserInt("Enter new zipcode:");
                    temp.setZipCode(newZip);
                    break;
                case 7:
                    stillEditing = false;
                default:
                    stillEditing = false;

            }
            String moreToEdit = cons.queryUserString("Would you like to continue editing this entry? \nYes or No?");
            moreToEdit.toUpperCase();
            if (moreToEdit.equals("YES")) {
                stillEditing = true;
            } else if (moreToEdit.equals("NO")) {
                stillEditing = false;
            }
            stillEditing = false;

        } while (stillEditing);

        dao.editAddress(key, temp);

        cons.displayUserString("Newly saved entry:");
        cons.displayUserString(temp.getFirstName() + " " + temp.getLastName());
        cons.displayUserString(temp.getStreetAddress());
        cons.displayUserString(temp.getCity());
        cons.displayUserString(temp.getState());
        cons.displayUserInt(temp.getZipCode());
    }

    private void removeAddress() {
        findAddress();
        int key = cons.queryUserInt("Enter ID of person to be removed.");
        dao.removeAddress(key);
        cons.displayUserString("\nEntry removed.\n");
    }

    private void countAddresses() {
        int num = dao.numAddress();
        cons.displayUserInt(num);
    }

    private void returnAllAddresses() {
        List<Address> addresses = dao.displayAddresses();
        for (Address currentAddress : addresses) {
            cons.displayUserString("\nID: " + currentAddress.getiD());
            cons.displayUserString(currentAddress.getFirstName() + " " + currentAddress.getLastName());
            cons.displayUserString(currentAddress.getStreetAddress());
            cons.displayUserString(currentAddress.getCity() + ", " + currentAddress.getState() + " " + currentAddress.getZipCode() + "\n");
        }
    }

    private void findAddress() {
        String lastName = cons.queryUserString("Please enter the last name of the resident you're searching for:");
        List<Address> currentAddress = dao.getAddress(lastName);
        for (Address address : currentAddress) {

            cons.displayUserString("\nID: " + address.getiD());
            cons.displayUserString(address.getFirstName() + " " + address.getLastName());
            cons.displayUserString(address.getStreetAddress());
            cons.displayUserString(address.getCity() + ", " + address.getState() + " " + address.getZipCode() + "\n");
        }
    }

    private void searchByCity() {
        String cityToSearch = cons.queryUserString("Please enter city you're searching by");
        List<Address> results = dao.searchByCity(cityToSearch);
        for (Address thisAddress : results) {

            cons.displayUserString("\nID: " + thisAddress.getiD());
            cons.displayUserString(thisAddress.getFirstName() + " " + thisAddress.getLastName());
            cons.displayUserString(thisAddress.getStreetAddress());
            cons.displayUserString(thisAddress.getCity() + ", " + thisAddress.getState() + " " + thisAddress.getZipCode() + "\n");
        }

    }

    private void searchByState() {
        String stateToSearch = cons.queryUserString("Please enter State you're searching by");
        Map<String, List<Address>> results = dao.searchByState(stateToSearch);
        for (String currentCity: results.keySet()) {
            cons.displayUserString(currentCity);
            for (Address thisAddress : results.get(currentCity)) {
                
            }
        }
        
        
        
//        Set<String> citiesOfState = results.keySet();
//        Collection<List<Address>> addressesByState = results.values();
//        for (int i = 0; i < results.size(); i++) {
//            cons.displayUserString(citiesOfState[i] + addressesByState[i]);
//        
//            }
            
        }
    

    private void searchByZipCode() {
        int zipToSearchBy = cons.queryUserInt("Please enter ZipCode you're searching by");
        List<Address> results = dao.searchByZipCode(zipToSearchBy);
        for (Address thisAddress : results) {

            cons.displayUserString("\nID: " + thisAddress.getiD());
            cons.displayUserString(thisAddress.getFirstName() + " " + thisAddress.getLastName());
            cons.displayUserString(thisAddress.getStreetAddress());
            cons.displayUserString(thisAddress.getCity() + ", " + thisAddress.getState() + " " + thisAddress.getZipCode() + "\n");
        }

    }

}
