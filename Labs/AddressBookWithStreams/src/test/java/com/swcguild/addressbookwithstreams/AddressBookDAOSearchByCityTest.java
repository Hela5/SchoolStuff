/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbookwithstreams;

import com.swcguild.addressbookwithstreams.dao.AddressBookDAO;
import com.swcguild.addressbookwithstreams.dao.AddressBookDAOFileImpl;
import com.swcguild.addressbookwithstreams.dto.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
public class AddressBookDAOSearchByCityTest {

    AddressBookDAO dao;
    Address a1;
    Address a2;
    Address a3;

    public AddressBookDAOSearchByCityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        a1 = new Address();
        a1.setiD(1);
        a1.setFirstName("Mary");
        a1.setLastName("Hai");
        a1.setStreetAddress("123 Main Street");
        a1.setCity("Akron");
        a1.setState("OH");
        a1.setZipCode(44232);

        a2 = new Address();
        a2.setiD(2);
        a2.setFirstName("Carrie");
        a2.setLastName("Sigh");
        a2.setStreetAddress("123 Main Street");
        a2.setCity("Dallas");
        a2.setState("TX");
        a2.setZipCode(44232);

        a3 = new Address();
        a3.setiD(3);
        a3.setFirstName("Harry");
        a3.setLastName("Tie");
        a3.setStreetAddress("123 Main Street");
        a3.setCity("Akron");
        a3.setState("FL");
        a3.setZipCode(44542);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void searchByNullCityTest() {
        dao = new AddressBookDAOFileImpl();
        dao.addAddress(a1);
        dao.addAddress(a2);
        
        String city = null;
        List result = dao.searchByCity(city);

        
       assertEquals(0, result.size());

    }
    
    @Test
    public void searchByCityTest() {
        dao = new AddressBookDAOFileImpl();
        dao.addAddress(a1);
        dao.addAddress(a2);
        dao.addAddress(a3);
        String city = "Akron";
        List result = dao.searchByCity(city);

        assertEquals(2, result.size());
    }
    
    @Test
    public void searchByBadNameCityTest() {
        dao = new AddressBookDAOFileImpl();
        dao.addAddress(a1);
        dao.addAddress(a2);
        dao.addAddress(a3);
        String city = "BOGUS";
        List result = dao.searchByCity(city);

        assertEquals(0, result.size());
    }
}
