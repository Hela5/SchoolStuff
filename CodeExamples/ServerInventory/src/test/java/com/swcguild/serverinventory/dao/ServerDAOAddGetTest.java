/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.dao;

import com.swcguild.serverinventory.dto.Server;
import java.time.LocalDate;
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
public class ServerDAOAddGetTest {
//redundant to seperate add from get since you have to use one to do the other

    ServerDAO dao;
    Server s1;
    Server s2;
    Server s3;

    public ServerDAOAddGetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dao = new ServerDAOInMemImpl();

        s1 = new Server();
        s1.setName("Test Server");
        s1.setIp("130.45.34.210");
        s1.setMake("Dell");
        s1.setNumProcessors(16);
        s1.setPurchaseDate(LocalDate.now());
        s1.setRam("256GB DDR");

        s2 = new Server();
        s2.setName("Test Server2");
        s2.setIp("130.47.34.211");
        s2.setMake("Dell");
        s2.setNumProcessors(24);
        s2.setPurchaseDate(LocalDate.now());
        s2.setRam("64GB DDR");

        s3 = new Server();
        s3.setName("Test Server3");
        s3.setIp("160.45.25.218");
        s3.setMake("HP");
        s3.setNumProcessors(8);
        s3.setPurchaseDate(LocalDate.now());
        s3.setRam("16GB DDR");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getNonExistentServer() {
        //make sure when I ask for something from an empty DAO I get nothing back*
        Server testServer = dao.getServer(7);
        assertNull(testServer);
        // it should return a null, otherwise something's wrong

        dao.addServer(s1);
        testServer = dao.getServer(7);
        assertNull(testServer);
        //even though there's something in DAO now, still returns null with bogus name
    }

    @Test
    public void addGetServerTest() {
        //where equals and hashcode comes in handy to do comparisons 
        //otherwise you have to hardcode that everything is truly the same

        dao.addServer(s1);
        Server fromDAO = dao.getServer(s1.getId());
        assertEquals(s1, fromDAO);
        
        //now have more to pick from and ensure it can pick and pull correct one
        dao.addServer(s2);
        dao.addServer(s3);
        
        fromDAO = dao.getServer(s1.getId());
        assertEquals(s1, fromDAO);
        
        fromDAO = dao.getServer(s2.getId());
        assertEquals(s2, fromDAO);
        
        fromDAO = dao.getServer(s3.getId());
        assertEquals(s3, fromDAO);
        
//        //shouldn't blow up when dealing with null but really an edgecase condition, now one to test here
//        Server nullServer = null;
//        dao.addServer(nullServer);
//        fromDAO = dao.getServer(null)
       
    }
}
