/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstreams.controller;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.dvdlibrarywithstreams.dao.DVDLibraryDAO;
import com.swcguild.dvdlibrarywithstreams.dao.DVDLibraryDAOFileImpl;
import com.swcguild.dvdlibrarywithstreamsdto.DVD;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DVDLibraryController {

    ConsoleIO cons = new ConsoleIO();
    DVDLibraryDAO dao = new DVDLibraryDAOFileImpl();
    DVD dvd = new DVD();

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
        cons.displayUserString("1)   Add a DVD. ");
        cons.displayUserString("2)   Remove a DVD.");
        cons.displayUserString("3)   Find by Title.");
        cons.displayUserString("4)   Edit DVD Info.");
        cons.displayUserString("5)   List all DVDs in Library.");
        cons.displayUserString("6)   Find all DVDS released in specific Year");
        cons.displayUserString("7)   Find all DVDS with same Rating");
        cons.displayUserString("8)   Find all DVDS by Studio");
        cons.displayUserString("9)   Get average age of all DVDs");
        cons.displayUserString("10)  Find newest DVD");
        cons.displayUserString("11)  Find oldest DVD");
        cons.displayUserString("12)  Get average number of personal notes");
        cons.displayUserString("13   Exit.");
        cons.displayUserString("--------------------------");
    }

    private void addDVD() {
        String title = cons.queryUserString("Please enter the title of the DVD: ");
        String releaseDate = cons.queryUserString("Enter the film's release date in formate of YYYY-MM-DD: ");
        String rating = cons.queryUserString("Enter the rating it has: ");
        String directorName = cons.queryUserString("Enter the name of the director: ");
        String studio = cons.queryUserString("Enter the studio: ");
        boolean moreComments = true;
        String anotherRating = "";
        String userRating = "";
        List<String> userCommentsCollected = new ArrayList<>();
        do {
            userRating = cons.queryUserString("Enter any personal comments you may like to add for future reference: ");
            userCommentsCollected.add(userRating);
            String additionalComments = cons.queryUserString("Any further comments to add? Yes or No?");
            additionalComments.toUpperCase();
            if (additionalComments.equals("YES")) {
                anotherRating = cons.queryUserString("Enter next comment");
                userCommentsCollected.add(anotherRating);
                moreComments = false;
            } else if (additionalComments.equals("NO")) {
                moreComments = false;
            }

        } while (moreComments);

        DVD currentDVD = new DVD();
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(LocalDate.parse(releaseDate));
        currentDVD.setRating(rating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userCommentsCollected);

        dao.addDVD(currentDVD);
    }

    private void removeDVD() {
        findDVD();
        int userChoice = cons.queryUserInt("Please choose ID of DVD to be removed.");
        dao.removeDVD(userChoice);
        cons.displayUserString("\nDVD has been removed!\n");
    }

    private void findDVD() {
        String title = cons.queryUserString("Please enter the title of the DVD you are searching for: ");
        List<DVD> dvdList = dao.getDVD(title);
        for (DVD currentDVD : dvdList) {
            if (currentDVD != null) {
                cons.displayUserString("\n" + currentDVD.getTitle());
                cons.displayUserString(currentDVD.getReleaseDate());
                cons.displayUserString(currentDVD.getRating());
                cons.displayUserString(currentDVD.getDirectorName());
                cons.displayUserString(currentDVD.getStudio());
                for (String comment : currentDVD.getUserRating()) {
                    cons.displayUserString(comment);
                }
            } else {
                cons.displayUserString("No known DVD by that title.\n");
            }
        }
    }

    private void editDVD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnAllDVDs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void findAllReleasedInYear() {
        int yearToSearch = cons.queryUserInt("Please enter year you are searching in.");
        LocalDate.parse(yearToSearch);
        dao.findAllMoviesReleasedInYear(yearToSearch);

    }

    private void findAllWithRating() {
        String ratingToSearch = cons.queryUserString("Please enter rating to search by");
        dao.findAllMoviesWithRating(ratingToSearch);
    }

    private void findAllReleasedByStudio() {
        String studioToSearch = cons.queryUserString("Please enter Studio to search by");
        dao.findAllReleasedByStudio(studioToSearch);
    }

    private void averageAgeOfMovies() {
        dao.averageAgeOfMovies();
    }

    private void getNewestMovie() {
        dao.getNewestMovie();
    }

    private void getOldestMovie() {
        dao.getOldestMovie();
    }

    private void averageNumNotes() {
        dao.averageNumPersonalNotes();
    }
}
