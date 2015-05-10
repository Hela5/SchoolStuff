/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class AddressBookController {

    ConsoleIO cons = new ConsoleIO();
    AddressDAO addD = new AddressBookFileImpl();
    Address address = new Address();

    public void run() {
        boolean keepRunning = true;
        try{
        addD.loadAddresses();
        } catch (Exception e) {
            e.getMessage();
        }

        while (keepRunning) {
            displayMenu();
            int userChoice = cons.queryUserInt("\nPlease choose from the listed options.");

            switch (userChoice) {
                case 1:
                    addAddress();
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
                    cons.displayUserString("\n--Exiting program--");
                    keepRunning = false;
                    break;
                default:
                    cons.displayUserString("Not a valid option, please try again.");
            }
            try {
                addD.writeAddresses();
            } catch (IOException e) {
                e.getMessage();
            }
        }
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
        cons.displayUserString("7)  Exit                        ");
        cons.displayUserString("                                ");
        cons.displayUserString("********************************");
    }

    private void addAddress() {
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
        addD.addAddress(currentAddress);
        cons.displayUserString("\nEntering new address...\n");
    }

    private void removeAddress() {
        findAddress();
        int key = cons.queryUserInt("Enter ID of person to be removed.");
        addD.removeAddress(key);
        cons.displayUserString("\nEntry removed.\n");
    }

    private void findAddress() {
        String lastName = cons.queryUserString("Please enter the last name of the resident you're searching for:");
        ArrayList<Address> currentAddress = addD.getAddress(lastName);
        for (Address address : currentAddress) {

            cons.displayUserString("\nID: " + address.getiD());
            cons.displayUserString(address.getFirstName() + " " + address.getLastName());
            cons.displayUserString(address.getStreetAddress());
            cons.displayUserString(address.getCity() + ", " + address.getState() + " " + address.getZipCode() + "\n");
        }
    }

    private void countAddresses() {
        int num = addD.numAddress();
        cons.displayUserInt(num);
    }

    private void returnAllAddresses() {
        ArrayList<Address> addresses = addD.displayAddresses();
        for (Address currentAddress : addresses) {
            cons.displayUserString("\nID: " + currentAddress.getiD());
            cons.displayUserString(currentAddress.getFirstName() + " " + currentAddress.getLastName());
            cons.displayUserString(currentAddress.getStreetAddress());
            cons.displayUserString(currentAddress.getCity() + ", " + currentAddress.getState() + " " + currentAddress.getZipCode() + "\n");
        }

    }

    private void editAddress() {
        findAddress();
        int key = cons.queryUserInt("Enter ID of entry to be edited.");
        Address temp = addD.getAddress(key);
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
            if (moreToEdit.equals("yes")) {
                stillEditing = true;
            } else if (moreToEdit.equals("no")) {
                stillEditing = false;
            }

        } while (stillEditing);

        addD.editAddress(key, temp);

        cons.displayUserString("Newly saved entry:");
        cons.displayUserString(temp.getFirstName() + " " + temp.getLastName());
        cons.displayUserString(temp.getStreetAddress());
        cons.displayUserString(temp.getCity());
        cons.displayUserString(temp.getState());
        cons.displayUserInt(temp.getZipCode());
    }

}
