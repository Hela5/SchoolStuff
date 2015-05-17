/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstreams;

import com.swcguild.dvdlibrarywithstreams.dao.DVDLibraryDAO;
import com.swcguild.dvdlibrarywithstreams.dao.DVDLibraryDAOFileImpl;
import com.swcguild.dvdlibrarywithstreamsdto.DVD;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class DVDLibraryDAOGetNewestMovieTest {

    DVDLibraryDAO dao;
    DVD d1;
    DVD d2;
    DVD d3;

    public DVDLibraryDAOGetNewestMovieTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        d1 = new DVD();
        d1.setTitle("The Movie");
        d1.setReleaseDate(LocalDate.parse("1999-01-15"));
        d1.setDirectorName("Tha Directa");
        d1.setStudio("Their house");
        d1.setRating("G");
        ArrayList<String> ex = new ArrayList<>();
        ex.add("Hilarious");
        d1.setUserRating(ex);

        d2 = new DVD();
        d2.setTitle("Another Movie");
        d2.setReleaseDate(LocalDate.parse("1999-01-15"));
        d2.setDirectorName("That Directa");
        d2.setStudio("Hollywood");
        d2.setRating("G");
        ArrayList<String> nex = new ArrayList<>();
        nex.add("Hilarious");
        nex.add("Cried my eyes out");
        d1.setUserRating(ex);

        d3 = new DVD();
        d3.setTitle("See My Movie");
        d3.setReleaseDate(LocalDate.parse("2014-01-15"));
        d3.setDirectorName("A Directa");
        d3.setStudio("BollyWood");
        d3.setRating("G");
        ArrayList<String> next = new ArrayList<>();
        next.add("Hopeful");
        d3.setUserRating(next);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void getNewestMovieTest1() {
        dao = new DVDLibraryDAOFileImpl();
        
        dao.addDVD(d3);
        List fromDAO = dao.getNewestMovie();
        assertEquals(1, fromDAO.size());
        
        dao.addDVD(d1);
        dao.addDVD(d2);
        fromDAO = dao.getNewestMovie();
        assertEquals(1, fromDAO.size());
        
    }
    
//    @Test
//    public void getNewestNullMovieTest() {
//        dao = new DVDLibraryDAOFileImpl();
//        
//        dao.addDVD(d3);
//        d3.setReleaseDate(null);
//        List fromDAO = dao.getNewestMovie();
//        assertEquals(0, fromDAO.size());
//               
//    }
}
