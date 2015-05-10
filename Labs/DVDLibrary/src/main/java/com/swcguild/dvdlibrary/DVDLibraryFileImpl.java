/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class DVDLibraryFileImpl implements DVDLibraryDAO {

    private final HashMap<String, DVD> dvds = new HashMap<>();

    public static final String LIBRARY_FILE = "library.text";
    public static final String DELIMITER = " :: ";

    @Override
    public void loadLibrary() throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            DVD currentDVD = new DVD();
            currentDVD.setTitle(currentTokens[0]);
            currentDVD.setReleaseDate(currentTokens[1]);
            currentDVD.setRating(currentTokens[2]);
            currentDVD.setDirectorName(currentTokens[3]);
            currentDVD.setStudio(currentTokens[4]);
            currentDVD.setUserRating(currentTokens[5]);
            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        sc.close();
    }

    @Override
    public void writeLibrary() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        String[] keys = this.returnAllDVDs();
        for (int i = 0; i < keys.length; i++) {
            DVD currentDVD = this.getDVD(keys[i]);
            out.println(currentDVD.getTitle() + DELIMITER
                    + currentDVD.getReleaseDate() + DELIMITER
                    + currentDVD.getRating() + DELIMITER
                    + currentDVD.getDirectorName() + DELIMITER
                    + currentDVD.getStudio() + DELIMITER
                    + currentDVD.getUserRating());
            out.flush();
        }
        out.close();

    }

    @Override
    public DVD getDVD(String title) {
        return dvds.get(title);
    }

    @Override
    public DVD addDVD(String title, DVD dvd) {
        return dvds.put(title, dvd);
    }

    @Override
    public DVD removeDVD(String title) {
        return dvds.remove(title);
    }

    @Override
    public String[] returnAllDVDs() {
        Set<String> titles = dvds.keySet();
        String[] dvdArray = new String[titles.size()];
        dvdArray = titles.toArray(dvdArray);
        return dvdArray;
    }

    @Override
    public void editDVD(String title, DVD newDVD) {
        getDVD(title);
        dvds.replace(title, newDVD);
    }

}
