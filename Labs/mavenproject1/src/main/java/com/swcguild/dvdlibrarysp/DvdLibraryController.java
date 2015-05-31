/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarycomponentswap;

import com.swcguild.consoleio.ConsoleIO;
import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class DvdLibraryController {

    ConsoleIO cons = new ConsoleIO();
    DvdLibraryDao dao = new DvdLibraryDaoInMemImpl();
    Dvd newDvd = new Dvd();

    public void run() {
        boolean keepRunning = true;
        int menuPick = 0;
        
        while (keepRunning) {

            printMenu();
            menuPick = cons.queryUserInt("Please pick from the following choices: ");
            switch (menuPick) {
                case 1:
                    addDvd();
                    break;
                case 2:
                    removeDvd();
                    break;
                case 3:
                    listAllDvds();
                    break;
                case 4:
                    getByTitle();
                    break;
                case 5:
                    getByRating();
                    break;
                case 6:
                    getByStudio();
                    break;
                case 7:
                    break;
                default:
                    cons.displayUserString("Invalid option, please try again.");

            }
        }

    }

    private void printMenu() {
        cons.displayUserString("\n^^^^^^^^^^^^^^^^^^^^^^^^^");
        cons.displayUserString("DVD Library Main Menu: ");
        cons.displayUserString("^^^^^^^^^^^^^^^^^^^^^^^^^");
        cons.displayUserString("1)  Add a DVD. ");
        cons.displayUserString("2)  Remove a DVD.");
        cons.displayUserString("3)  List all DVDs.");
        cons.displayUserString("4)  Search By Title.");
        cons.displayUserString("5)  Search by Rating");
        cons.displayUserString("6)  Search by Studio.");
        cons.displayUserString("7)  Exit.");
        cons.displayUserString("--------------------------");
    }

    private void addDvd() {
        String title = cons.queryUserString("Please enter the title of the DVD: ");
        String releaseDate = cons.queryUserString("Enter the film's release date in format of YYYY-MM-DD:");
        String rating = cons.queryUserString("Enter the rating it has: ");
        String directorName = cons.queryUserString("Enter the name of the director: ");
        String studio = cons.queryUserString("Enter the studio: ");
        String note = cons.queryUserString("Enter any personal comments you may like to add for future reference: ");

        Dvd currentDVD = new Dvd();
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(LocalDate.parse(releaseDate));
        currentDVD.setMpaaRating(rating);
        currentDVD.setDirector(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setNote(note);

        dao.add(currentDVD);
    }

    private void removeDvd() {
        getByTitle();
        int userChoice = cons.queryUserInt("Please choose ID of DVD to be removed.");
        dao.remove(userChoice);
        cons.displayUserString("\nDVD has been removed!\n");
    }

    private void listAllDvds() {
        List<Dvd> list = dao.listAll();
        for (Dvd currentDVD : list) {
            cons.displayUserString("\n" + currentDVD.getId() + "\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getMpaaRating());
            cons.displayUserString(currentDVD.getDirector());
            cons.displayUserString(currentDVD.getStudio());
            cons.displayUserString(currentDVD.getNote());
        }
    }

    private void getByTitle() {
        String title = cons.queryUserString("Please enter the title of the DVD you are searching for: ");
        List<Dvd> dvdList = dao.getByTitle(title);
        cons.displayUserString("\n\tResults for searching by " + title);
        for (Dvd currentDVD : dvdList) {
            if (currentDVD != null) {
                cons.displayUserString("\n" + currentDVD.getId() + "\n" + currentDVD.getTitle());
                cons.displayUserString(currentDVD.getReleaseDate().toString());
                cons.displayUserString(currentDVD.getMpaaRating());
                cons.displayUserString(currentDVD.getDirector());
                cons.displayUserString(currentDVD.getStudio());
                cons.displayUserString(currentDVD.getNote());

            } else {
                cons.displayUserString("No known DVD by that title.\n");
            }
        }
    }

    private void getByRating() {
        String ratingToSearch = cons.queryUserString("Please enter rating you'd like to search by: ");
        List<Dvd> list = dao.getByRating(ratingToSearch);
        cons.displayUserString("\n\tResults for DVD's with a " + ratingToSearch + " MPAA Rating");
        for (Dvd currentDVD : list) {
            cons.displayUserString("\n" + currentDVD.getId() + "\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getMpaaRating());
            cons.displayUserString(currentDVD.getDirector());
            cons.displayUserString(currentDVD.getStudio());
            cons.displayUserString(currentDVD.getNote());
        }
    }

    private void getByStudio() {
        String studioToSearch = cons.queryUserString("Please enter studio you'd like to search by: ");
        List<Dvd> list = dao.getByRating(studioToSearch);
        cons.displayUserString("\n\tResults for DVD's produced in " + studioToSearch + " studios");
        for (Dvd currentDVD : list) {
            cons.displayUserString("\n" + currentDVD.getId() + "\n" + currentDVD.getTitle());
            cons.displayUserString(currentDVD.getReleaseDate().toString());
            cons.displayUserString(currentDVD.getMpaaRating());
            cons.displayUserString(currentDVD.getDirector());
            cons.displayUserString(currentDVD.getStudio());
            cons.displayUserString(currentDVD.getNote());
        }

    }
}
