/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarycomponentswap;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jim
 */
public class AddGetDeleteTest {
    
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DvdLibraryController linkToCtllr = ctx.getBean("linkToCtllr", DvdLibraryController.class);

    DvdLibraryDao dao;
    Dvd dvd1;
    Dvd dvd2;
    Dvd dvd3;
    Dvd dvd4;
    Dvd dvd5;

    public AddGetDeleteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
//        dao = new DvdLibraryDaoInMemImplJimBostick();
        dao = new DvdLibraryDaoInMemImplAndriaFuquen();

        dvd1 = new Dvd();
        dvd1.setTitle("Test Title1");
        dvd1.setReleaseDate(LocalDate.of(2004, 1, 1));
        dvd1.setMpaaRating("PG");
        dvd1.setDirector("Test Director1");
        dvd1.setStudio("Test Studio1");
        dvd1.setNote("Test User Rating 1");

        dvd2 = new Dvd();
        dvd2.setTitle("Test Title2");
        dvd2.setReleaseDate(LocalDate.of(2007, 1, 1));
        dvd2.setMpaaRating("PG-13");
        dvd2.setDirector("Test Director2");
        dvd2.setStudio("Test Studio2");
        dvd2.setNote("Test User Rating 2");

        dvd3 = new Dvd();
        dvd3.setTitle("Test Title3");
        dvd3.setReleaseDate(LocalDate.of(2010, 1, 1));
        dvd3.setMpaaRating("PG-13");
        dvd3.setDirector("Test Director3");
        dvd3.setStudio("Test Studio3");
        dvd3.setNote("Test User Rating 3");

        dvd4 = new Dvd();
        dvd4.setTitle("Test Title4");
        dvd4.setReleaseDate(LocalDate.of(2012, 1, 1));
        dvd4.setMpaaRating("R");
        dvd4.setDirector("Test Director4");
        dvd4.setStudio("Test Studio4");
        dvd4.setNote("Test User Rating 4");

        dvd5 = new Dvd();
        dvd5.setTitle("Test Title5");
        dvd5.setReleaseDate(LocalDate.of(2013, 1, 1));
        dvd5.setMpaaRating("PG-13");
        dvd5.setDirector("Test Director3");
        dvd5.setStudio("Test Studio2");
        dvd5.setNote("Test User Rating 5");
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void AddGetRemoveDvdTest() {

        dao.add(dvd1);
        Dvd dvdListFromDao = dao.getById(1);
        assertTrue(dvdListFromDao.equals(dvd1));

        dao.remove(1);
        Dvd dvdFromDao2 = dao.getById(1);
        assertNull(dvdFromDao2);
    }

    @Test
    public void ExtendedAddGetRemoveDvdTest() {

        dao.add(dvd1);
        dao.add(dvd2);
        dao.add(dvd3);
        dao.add(dvd4);
        dao.add(dvd5);
        
        // content verification  note: ID num is assigned in the dao
        Dvd dvdFromDao = dao.getById(3);
        assertTrue(dvdFromDao.getTitle().equals(dvd3.getTitle()));;
        assertTrue(dvdFromDao.getDirector().equals(dvd3.getDirector()));
        assertTrue(dvdFromDao.getMpaaRating().equals(dvd3.getMpaaRating()));
        assertTrue(dvdFromDao.getStudio().equals(dvd3.getStudio()));
        assertTrue(dvdFromDao.getReleaseDate().equals(dvd3.getReleaseDate()));
        assertTrue(dvdFromDao.getNote().equals(dvd3.getNote()));
        assertTrue(dvdFromDao.getId()==3);

//      get by studio
        List<Dvd> dvdListStudio = dao.getByStudio(dvd2.getStudio());
        assertTrue(dvdListStudio.contains(dvd2));
        assertTrue(dvdListStudio.contains(dvd5));
        assertTrue(dvdListStudio.size() == 2);

        // verify results after dvd removal
        dao.remove(5);
        List<Dvd> dvdListStudio2 = dao.getByStudio(dvd2.getStudio());
        assertTrue(dvdListStudio2.contains(dvd2));
        assertFalse(dvdListStudio2.contains(dvd5));
        assertTrue(dvdListStudio2.size() == 1);
    }

    @Test
    public void GetMpaaDvdTest() {

        dao.add(dvd1);
        dao.add(dvd2);
        dao.add(dvd3);
        dao.add(dvd4);
        dao.add(dvd5);
        List<Dvd> dvdListFromDao = dao.getByRating(dvd4.getMpaaRating());
        assertTrue(dvdListFromDao.contains(dvd4));
        assertTrue(dvdListFromDao.size() == 1);

        List<Dvd> dvdListFromDao2 = dao.getByRating(dvd5.getMpaaRating());
        assertTrue(dvdListFromDao2.contains(dvd5));
        assertTrue(dvdListFromDao2.contains(dvd2));
        assertTrue(dvdListFromDao2.contains(dvd2));
        assertTrue(dvdListFromDao2.size() == 3);
    }
}
