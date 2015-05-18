/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstreams.dao;

import com.swcguild.dvdlibrarywithstreamsdto.DVD;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDAOFileImpl implements DVDLibraryDAO {

    public Map<Integer, DVD> dvds = new HashMap<>();

    public static final String LIBRARY_FILE = "library.text";
    public static final String DELIMITER = " :: ";
    private static int iD = 0;

    @Override
    public void loadLibrary() throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String str = "";
            String[] newArray = new String[str.length()];

            DVD currentDVD = new DVD();
            currentDVD.setiD(Integer.parseInt(currentTokens[0]));
            currentDVD.setTitle(currentTokens[1]);
            currentDVD.setReleaseDate(LocalDate.parse(currentTokens[2]));
            currentDVD.setRating(currentTokens[3]);
            currentDVD.setDirectorName(currentTokens[4]);
            currentDVD.setStudio(currentTokens[5]);
            String[] strA = currentTokens[6].split("++");
            ArrayList<String> thisList = new ArrayList<>();
            thisList.addAll(Arrays.asList(strA));
            currentDVD.setUserRating(thisList);
            dvds.put(currentDVD.getiD(), currentDVD);
            if (currentDVD.getiD() > iD) {
                iD = currentDVD.getiD();
            }
        }
        sc.close();
        iD++;
    }

    @Override
    public void writeLibrary() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        List<Integer> keys = this.returnAllDVDs();
        for (int i = 0; i < keys.size(); i++) {
            DVD currentDVD = this.getDVD(keys.get(i));
            out.print(currentDVD.getiD() + DELIMITER
                    + currentDVD.getTitle() + DELIMITER
                    + currentDVD.getReleaseDate() + DELIMITER
                    + currentDVD.getRating() + DELIMITER
                    + currentDVD.getDirectorName() + DELIMITER
                    + currentDVD.getStudio());
            for (String rating : currentDVD.getUserRating()) {
                out.print(rating + "++");
            }
            out.print("++");
            out.println();
            out.flush();
        }
        out.close();
    }

    @Override
    public DVD getDVD(int iD) {
        return dvds.get(iD);
    }
    
      @Override
    public List getDVD(String title) {
        return dvds.values()
                .stream()
                .filter(s -> s.getTitle().equals(title))
                .collect(Collectors.toList());    
    }
    

    @Override
    public void addDVD(DVD dvd) {
        dvd.setiD(iD++);
        dvds.put(dvd.getiD(), dvd);
//        iD++;
    }

    @Override
    public DVD removeDVD(int iD) {
        return dvds.remove(iD);
    }

    @Override
    public List returnAllDVDs() {
        Set<Integer> iDs = dvds.keySet();
        List<Integer> dvdArray = new ArrayList(iDs.size());
        for (Integer currentID : iDs) {
            dvdArray.add(currentID);
        }
        return dvdArray;
    }

    @Override
    public void editDVD(int iD, DVD newDVD) {
        getDVD(iD);
        dvds.replace(iD, newDVD);
    }

    @Override
    public List<DVD> findAllMoviesReleasedInYear(LocalDate year) {
        return dvds.values()
                .stream()
                .filter(s -> s.getReleaseDate().equals(year))
                .collect(Collectors.toList());
    }

    @Override
    public List<DVD> findAllMoviesWithRating(String rating) {
        return dvds.values()
                .stream()
                .filter(s -> s.getRating().equals(rating))
                .collect(Collectors.toList());
    }

    @Override
    public List<DVD> findAllReleasedByStudio(String studio) {
        return dvds.values()
                .stream()
                .filter(s -> s.getStudio().equals(studio))
                .collect(Collectors.toList());
    }

    @Override
    public double averageAgeOfMovies() {
        return dvds.values()
                .stream()
                .mapToLong(DVD::getDVDAge)
                .average()
                .getAsDouble();
    }

    @Override
    public List<DVD> getNewestMovie() {
        long youngestAge = dvds.values()
                .stream()
                .mapToLong(DVD::getDVDAge)
                .min()
                .getAsLong();
        return dvds.values()
                .stream()
                .filter(s -> s.getDVDAge() == youngestAge)
                .collect(Collectors.toList());
    }

    @Override
    public List<DVD> getOldestMovie() {
        long oldestAge = dvds.values()
                .stream()
                .mapToLong(DVD::getDVDAge)
                .max()
                .getAsLong();
        return dvds.values()
                .stream()
                .filter(s -> s.getDVDAge() == oldestAge)
                .collect(Collectors.toList());

    }

    @Override
    public double averageNumPersonalNotes() {
        return dvds.values()
                .stream()
                .mapToLong(s -> s.getUserRating().size())
                .average()
                .getAsDouble();
    }

  

}
