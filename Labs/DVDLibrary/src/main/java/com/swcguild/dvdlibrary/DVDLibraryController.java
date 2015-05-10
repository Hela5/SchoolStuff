/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary;

/**
 *
 * @author apprentice
 */
public class DVDLibraryController {

    DVDLibraryDAO libr = new DVDLibraryFileImpl();
    ConsoleIO cons = new ConsoleIO();
    DVD newDVD = new DVD();

    public void run() {

        boolean keepRunning = true;
        int menuPick = 0;

        while (keepRunning) {
            try {
                libr.loadLibrary();
            } catch (Exception e) {
                e.getMessage();
            }
            printMenu();
            menuPick = cons.queryUserIntRange("Please pick from the following choices: ", 1, 6);
            switch (menuPick) {
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
                    cons.displayUserString("--Exiting Program--");
                    keepRunning = false;
                    break;
                default:
                    cons.displayUserString("Invalid Option. Try Again!");
            }
            try {
                libr.writeLibrary();
            } catch (Exception e) {
                e.getMessage();
            }

        }
        System.out.println("Have a nice day!");
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

        String title = cons.queryUserString("Please enter the title of the DVD: ");
        String releaseDate = cons.queryUserString("Enter the film's release date: ");
        String rating = cons.queryUserString("Enter the rating it has: ");
        String directorName = cons.queryUserString("Enter the name of the director: ");
        String studio = cons.queryUserString("Enter the studio: ");
        String userRating = cons.queryUserString("Enter any personal comments you may like to add for future reference: ");

        DVD currentDVD = new DVD();
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setRating(rating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);

        libr.addDVD(title, currentDVD);
    }

    private void removeDVD() {
        String title = cons.queryUserString("Please enter title of DVD to be removed: ");
        libr.removeDVD(title);
        cons.displayUserString("\nDVD has been removed!\n");
    }

    private void findDVD() {
        String title = cons.queryUserString("Please enter the title of the DVD you are searching for: ");
        DVD currentDVD = libr.getDVD(title);
        if (currentDVD != null) {
            cons.displayUserString("\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate());
            cons.displayUserString(currentDVD.getRating());
            cons.displayUserString(currentDVD.getDirectorName());
            cons.displayUserString(currentDVD.getStudio());
            cons.displayUserString(currentDVD.getUserRating());
        } else {
            cons.displayUserString("No known DVD by that title.\n");
        }
    }

    private void returnAllDVDs() {
        String[] titles = libr.returnAllDVDs();
        for (int i = 0; i < titles.length; i++) {
            DVD currentDVD = libr.getDVD(titles[i]);
            cons.displayUserString("\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate());
            cons.displayUserString(currentDVD.getRating());
            cons.displayUserString(currentDVD.getDirectorName());
            cons.displayUserString(currentDVD.getStudio());
            cons.displayUserString(currentDVD.getUserRating());
        }
    }

    private void editDVD() {
        findDVD();
        String titleToEdit = cons.queryUserString("For verification purposes, please re-enter Movie Title to be edited:");
        DVD temp = libr.getDVD(titleToEdit);
        String newTitle = "";
        String newReleaseDate;
        String newRating;
        String newDirectorName;
        String newStudio;
        String newUserRating;
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
                    temp.setReleaseDate(newReleaseDate);
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
                    newUserRating = cons.queryUserString("Enter new personal comments");
                    temp.setUserRating(newUserRating);
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

        libr.editDVD(newTitle, temp);

        cons.displayUserString("Newly saved entry:");
        cons.displayUserString(temp.getTitle());
        cons.displayUserString(temp.getReleaseDate());
        cons.displayUserString(temp.getRating());
        cons.displayUserString(temp.getDirectorName());
        cons.displayUserString(temp.getStudio());
        cons.displayUserString(temp.getUserRating());

    }

}
