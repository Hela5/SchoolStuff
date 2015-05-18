/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbookwithstreams;

import com.swcguild.addressbookwithstreams.dao.AddressBookDAO;
import com.swcguild.addressbookwithstreams.dao.AddressBookDAOFileImpl;
import com.swcguild.addressbookwithstreams.dto.Address;
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
public class AddressBookDAOAddGetTest {

    AddressBookDAO dao;
    Address a1;
    Address a2;
    Address a3;

    public AddressBookDAOAddGetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dao = new AddressBookDAOFileImpl();

        a1 = new Address();
        a1.setFirstName("Mary");
        a1.setLastName("Hai");
        a1.setStreetAddress("123 Main Street");
        a1.setCity("Akron");
        a1.setState("OH");
        a1.setZipCode(44232);

        a2 = new Address();
        a2.setFirstName("Carrie");
        a2.setLastName("Sigh");
        a2.setStreetAddress("123 Main Street");
        a2.setCity("Akron");
        a2.setState("TX");
        a2.setZipCode(44232);

        a3 = new Address();
        a3.setFirstName("Harry");
        a3.setLastName("Tie");
        a3.setStreetAddress("123 Main Street");
        a3.setCity("Akron");
        a3.setState("FL");
        a3.setZipCode(44232);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void getNonExistentAddress() {
        Address testAddress = dao.getAddress(4);
        assertNull(testAddress);
        
        dao.addAddress(a1);
        testAddress = dao.getAddress(4);
        assertNull(testAddress);

    }

    @Test
    public void addGetAddressTest() {
        dao.addAddress(a1);
        Address fromDAO = dao.getAddress(a1.getiD());
        assertEquals(a1, fromDAO);
        
        dao.addAddress(a2);
        dao.addAddress(a3);
        
        fromDAO = dao.getAddress(a2.getiD());
        assertEquals(a2, fromDAO);
        fromDAO = dao.getAddress(a3.getiD());
        assertEquals(a3, fromDAO);
        

    }
    
      
}
