/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarycomponentswap;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
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
public class DvdLibraryDaoInMemImplTest {

    DvdLibraryDao dao;
    Dvd d1;
    Dvd d2;
    Dvd d3;

    public DvdLibraryDaoInMemImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        d1 = new Dvd();
        d1.setTitle("First Movie");
        d1.setDirector("Juan Jose");
        d1.setMpaaRating("G");
        d1.setStudio("That place");
        d1.setReleaseDate(LocalDate.parse("2001-12-05"));
        d1.setNote("Great cinematography");

        d2 = new Dvd();
        d2.setTitle("Second Movie");
        d2.setDirector("Matilda Jose");
        d2.setMpaaRating("R");
        d2.setStudio("Happy Place");
        d2.setReleaseDate(LocalDate.parse("2001-12-05"));
        d2.setNote("So Funny");

        d3 = new Dvd();
        d3.setTitle("Toodles");
        d3.setDirector("That director");
        d3.setMpaaRating("PG-13");
        d3.setStudio("That place");
        d3.setReleaseDate(LocalDate.parse("2001-12-05"));
        d3.setNote("Tears flowed like a river");

    }

    @After
    public void tearDown() {
    }

    @Test
    public void addGetDvdRegTest() {
        dao = new DvdLibraryDaoInMemImpl();

        dao.add(d1);
        Dvd result = dao.getById(d1.getId());
        assertEquals(d1, result);

        dao.add(d2);
        dao.add(d3);
        result = dao.getById(d3.getId());
        assertEquals(d3, result);
    }

    @Test
    public void removeDvdTest() {
        dao = new DvdLibraryDaoInMemImpl();

        dao.add(d1);
        dao.remove(d1.getId());
        assertNull(dao.getById(d1.getId()));

        dao.add(d2);
        dao.add(d3);
        dao.remove(d3.getId());
        assertNull(dao.getById(d3.getId()));

    }

    @Test
    public void listAllTest() {
        dao = new DvdLibraryDaoInMemImpl();

        dao.add(d1);
        List result = dao.listAll();
        assertEquals(1, result.size());

        dao.add(d2);
        dao.add(d3);
        result = dao.listAll();
        assertEquals(3, result.size());
    }
    
    @Test
    public void getByTitleTest() {
        dao = new DvdLibraryDaoInMemImpl();
        
        dao.add(d1);
        List<Dvd> result = dao.getByTitle(d1.getTitle());
        assertEquals(d1.getTitle(), result.get(0).getTitle());
        
        dao.add(d2);
        dao.add(d3);
        result = dao.getByTitle(d3.getTitle());
        assertEquals(d3.getTitle(), result.get(0).getTitle());
    }
    
    @Test
    public void getByRatingTest() {
        dao = new DvdLibraryDaoInMemImpl();
        
        dao.add(d1);
        List<Dvd> result = dao.getByRating(d1.getMpaaRating());
        assertEquals(d1.getMpaaRating(), result.get(0).getMpaaRating());
        
        
        dao.add(d2);
        dao.add(d3);
        result = dao.getByRating(d2.getMpaaRating());
        assertEquals(d2.getMpaaRating(), result.get(0).getMpaaRating());
    }
    
    @Test
    public void getByStudioTest() {
        dao = new DvdLibraryDaoInMemImpl();
        
        dao.add(d1);
        List<Dvd> result = dao.getByStudio(d1.getStudio());
        assertEquals(d1.getStudio(), result.get(0).getStudio());
        
        dao.add(d2);
        dao.add(d3);
        result = dao.getByStudio(d2.getStudio());
        assertEquals(d2.getStudio(), result.get(0).getStudio());
    }
    
    @Test
    public void getByIdTest() {
        dao = new DvdLibraryDaoInMemImpl();
        
        dao.add(d1);
        Dvd result = dao.getById(d1.getId());
        assertEquals(d1, result);
        
    }
}
