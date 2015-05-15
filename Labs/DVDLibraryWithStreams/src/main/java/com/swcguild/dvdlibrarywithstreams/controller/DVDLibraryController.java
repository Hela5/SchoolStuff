/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstreams.controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.dvdlibrarywithstreams.dao.DVDLibraryDAO;
import com.swcguild.dvdlibrarywithstreams.dao.DVDLibraryDAOFileImpl;

/**
 *
 * @author apprentice
 */
public class DVDLibraryController {

    ConsoleIO cons = new ConsoleIO();
    DVDLibraryDAO dao = new DVDLibraryDAOFileImpl();

    public void run() {
        int userChoice = 0;

        do {
            printMenu();
            userChoice = cons.queryUserInt("Please choose from the above options.");
            switch (userChoice) {
                case 1:
                    addDVD();
                    break;
                case 2:
                    removeDVD();
                    break;
                case 3:
                    findDVD();
                    break;
                case 4:
                    editDVD();
                    break;
                case 5:
                    returnAllDVDs();
                    break;
                case 6:
                    findAllReleasedInYear();
                    break;
                case 7:
                    findAllWithRating();
                    break;
                case 8:
                    findAllReleasedByStudio();
                    break;
                case 9:
                    averageAgeOfMovies();
                    break;
                case 10:
                    getNewestMovie();
                    break;
                case 11:
                    getOldestMovie();
                    break;
                case 12: 
                    averageNumNotes();
                    break;
                case 13:
                    break;
                default:
                    cons.displayUserString("Not a valid option, please try again.");
            }
        } while (userChoice != 13);
    }

        private void printMenu() {
        cons.displayUserString("\n^^^^^^^^^^^^^^^^^^^^^^^^^");
        cons.displayUserString("DVD Library Main Menu: ");
        cons.displayUserString("^^^^^^^^^^^^^^^^^^^^^^^^^");
        cons.displayUserString("1)  Add a DVD. ");
        cons.displayUserString("2)  Remove a DVD.");
        cons.displayUserString("3)  Find by Title.");
        cons.displayUserString("4)  Edit DVD Info.");
        cons.displayUserString("5)  List All in Library.");
        cons.displayUserString("6)  Exit.");
        cons.displayUserString("--------------------------");
    }

    private void addDVD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void removeDVD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void findDVD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void editDVD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnAllDVDs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void findAllReleasedInYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void findAllWithRating() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void findAllReleasedByStudio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void averageAgeOfMovies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getNewestMovie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getOldestMovie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void averageNumNotes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


