/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.serverinventory.dao.ServerDAO;
import com.swcguild.serverinventory.dao.ServerDAOInMemImpl;

/**
 *
 * @author apprentice
 */
public class ServerInventoryController {
    
    ConsoleIO cons = new ConsoleIO();
    ServerDAO dao = new ServerDAOInMemImpl();
    
    public void run() {
        int userChoice = 0;
        
        do {
            printMenu();
            userChoice = cons.queryUserInt("Please choose from the above options.");
            switch (userChoice) {
                case 1:
                    addServer();
                    break;
                case 2:
                    removeServer();
                    break;
                case 3:
                    listServersByManufacturer();
                    break;
                case 4:
                    listServersOlderThan();
                    break;
                case 5:
                    listServersOlderThanGroupByMake();
                    break;
                case 6:
                    getAverageServerAge();
                    break;
                case 7:
                    break;
                default:
                    cons.displayUserString("Not a valid option, please try again.");
            }
        } while (userChoice != 7);
    }
    
    private void printMenu() {
        cons.displayUserString("+++++++++++++++++++++++++++++++++++++");
        cons.displayUserString("1. Add Server");
        cons.displayUserString("2. Remove Server");
        cons.displayUserString("3. List Servers By Manufacturer");
        cons.displayUserString("4. List Servers Older Than");
        cons.displayUserString("5. List Servers Older Than Group By Make");
        cons.displayUserString("6. Get Average Server Age");
        cons.displayUserString("7. Exit");
        cons.displayUserString("+++++++++++++++++++++++++++++++++++++");
        
    }
    
    private void addServer() {
        cons.displayUserString("Add server...");
    }
    
    private void removeServer() {
        cons.displayUserString("Remove server...");
    }
    
    private void listServersByManufacturer() {
        cons.displayUserString("List server by manufacturer...");
    }
    
    private void listServersOlderThan() {
        cons.displayUserString("List server by older than'...");
    }
    
    private void listServersOlderThanGroupByMake() {
        cons.displayUserString("List servers older than group by make...");
    }
    
    private void getAverageServerAge() {
        cons.displayUserString("Get average server age...");
    }
}
