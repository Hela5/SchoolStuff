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

    public void run() throws Exception {
        dao.loadLibrary();
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
        dao.writeLibrary();
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
                cons.displayUserString(currentDVD.getReleaseDate().toString());
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
        findDVD();
        int iDToEdit = cons.queryUserInt("Please ID number of DVD you'd like to edit:");
        DVD temp = dao.getDVD(iDToEdit);
        String newTitle = "";
        String newReleaseDate;
        LocalDate realNewReleaseDate;
        String newRating;
        String newDirectorName;
        String newStudio;
        List<String> newUserRatings = null;
        String newComment;
        boolean stillEditing = true;

        do {
            cons.displayUserString("\nFields to edit:");
            cons.displayUserString("---------------");
            cons.displayUserString("1) Title");
            cons.displayUserString("2) Release Date");
            cons.displayUserString("3) Rating");
            cons.displayUserString("4) Director Name");
            cons.displayUserString("5) Studio");
            cons.displayUserString("6) Personal comments about film");
            cons.displayUserString("7) Return to main menu");
            int field = cons.queryUserInt("Which field would you like to edit?");

            switch (field) {
                case 1:
                    newTitle = cons.queryUserString("Enter new title");
                    temp.setTitle(newTitle);
                    break;
                case 2:
                    newReleaseDate = cons.queryUserString("Enter different release date");
                    realNewReleaseDate = LocalDate.parse(newReleaseDate);
                    temp.setReleaseDate(realNewReleaseDate);
                    break;
                case 3:
                    newRating = cons.queryUserString("Enter different rating");
                    temp.setRating(newRating);
                    break;
                case 4:
                    newDirectorName = cons.queryUserString("Enter new director name");
                    temp.setDirectorName(newDirectorName);
                    break;
                case 5:
                    newStudio = cons.queryUserString("Enter new studio");
                    temp.setStudio(newStudio);
                    break;
                case 6:
                    newComment = cons.queryUserString("Enter new personal comments");
                    newUserRatings.add(newComment);
                    temp.setUserRating(newUserRatings);
                    break;
                case 7:
                    stillEditing = false;
                default:
                    stillEditing = false;
            }
            String moreToEdit = cons.queryUserString("Would you like to continue editing this entry? \nYes or No?");
            if (moreToEdit.equals("Yes")) {
                stillEditing = true;
            } else if (moreToEdit.equals("No")) {
                stillEditing = false;
            }

        } while (stillEditing);

        dao.editDVD(iDToEdit, temp);

        cons.displayUserString("Newly saved entry:");
        cons.displayUserString(temp.getTitle());
        cons.displayUserString(temp.getReleaseDate().toString());
        cons.displayUserString(temp.getRating());
        cons.displayUserString(temp.getDirectorName());
        cons.displayUserString(temp.getStudio());
        for (String comment : temp.getUserRating()) {
            cons.displayUserString(comment);
        }

    }

    private void returnAllDVDs() {
        List 
    }

    private void findAllReleasedInYear() {
        String yearToSearch = cons.queryUserString("Please enter year you are searching in.");
        LocalDate newYearToSearch = LocalDate.parse(yearToSearch);
        dao.findAllMoviesReleasedInYear(newYearToSearch);

    }

    private void findAllWithRating() {
        String ratingToSearch = cons.queryUserString("Please enter rating to search by");
        List<DVD> allWithRating = dao.findAllMoviesWithRating(ratingToSearch);
        for (DVD currentDVD : allWithRating) {
            cons.displayUserString("\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getRating());
            cons.displayUserString(currentDVD.getDirectorName());
            cons.displayUserString(currentDVD.getStudio());
            for (String comment : currentDVD.getUserRating()) {
                cons.displayUserString(comment);
            }
        }

    }

    private void findAllReleasedByStudio() {
        String studioToSearch = cons.queryUserString("Please enter Studio to search by");
        List<DVD> allByStudio = dao.findAllReleasedByStudio(studioToSearch);
        for (DVD currentDVD : allByStudio) {
            cons.displayUserString("\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getRating());
            cons.displayUserString(currentDVD.getDirectorName());
            cons.displayUserString(currentDVD.getStudio());
            for (String comment : currentDVD.getUserRating()) {
                cons.displayUserString(comment);
            }
        }
    }

    private void averageAgeOfMovies() {
        double avgAge = dao.averageAgeOfMovies();
        cons.displayUserString("The average age of your DVDs is " + avgAge);
    }

    private void getNewestMovie() {
        List<DVD> newestMovies = dao.getNewestMovie();
        for (DVD currentDVD : newestMovies) {
            cons.displayUserString("\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getRating());
            cons.displayUserString(currentDVD.getDirectorName());
            cons.displayUserString(currentDVD.getStudio());
            for (String comment : currentDVD.getUserRating()) {
                cons.displayUserString(comment);
            }
        }
    }

    private void getOldestMovie() {
        List<DVD> oldestMovies = dao.getOldestMovie();
        for (DVD currentDVD : oldestMovies) {
            cons.displayUserString("\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getRating());
            cons.displayUserString(currentDVD.getDirectorName());
            cons.displayUserString(currentDVD.getStudio());
            for (String comment : currentDVD.getUserRating()) {
                cons.displayUserString(comment);

            }
        }
    }

    private void averageNumNotes() {
        double avgNum = dao.averageNumPersonalNotes();
        cons.displayUserString("You are averaging " + avgNum + " notes in the library per DVD");
    }
}
