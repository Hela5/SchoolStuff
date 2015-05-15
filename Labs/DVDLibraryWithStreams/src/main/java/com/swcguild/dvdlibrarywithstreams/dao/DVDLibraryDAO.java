/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstreams.dao;

import com.swcguild.dvdlibrarywithstreamsdto.DVD;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryDAO {

    public void loadLibrary() throws Exception;

    public void writeLibrary() throws IOException;

    public DVD getDVD(int iD);

    public void addDVD(DVD dvd);

    public DVD removeDVD(int iD);

    public String[] returnAllDVDs();

    public void editDVD(int iD, DVD newDVD);
    
    public List<DVD> findAllMoviesReleasedInYear(Long year);
    
    public List<DVD> findAllMoviesWithRating(String rating);
    
    public List<DVD> findAllReleasedByStudio (String studio);
    
    public double averageAgeOfMovies();
    
    public List<DVD> getNewestMovie();
    
    public List<DVD> getOldestMovie();
    
    public double averageNumPersonalNotes();
    
}
