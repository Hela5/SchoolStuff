/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contactlistmvc.dao;

import com.swcguild.contactlistmvc.dto.Contact;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class ContactListDaoTest {

    private ContactListDao dao;
    private Contact c1;
    private Contact c2;
    private Contact c3;

    public ContactListDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");

        dao = ctx.getBean("contactListDao", ContactListDao.class);

        c1 = new Contact();
        c1.setFirstName("Joe");
        c1.setLastName("Smith");
        c1.setCompany("Apple");
        c1.setEmail("smith@gmail.com");
        c1.setPhone("123-456-7890");

        c2 = new Contact();
        c2.setFirstName("Anna");
        c2.setLastName("Beth");
        c2.setCompany("Google");
        c2.setEmail("smith@gmail.com");
        c2.setPhone("456-456-7890");

        c3 = new Contact();
        c3.setFirstName("Larry");
        c3.setLastName("Ellison");
        c3.setCompany("Oracle");
        c3.setEmail("maxxin@gmail.com");
        c3.setPhone("123-456-7890");

    }

    @After
    public void tearDown() {
    }

    @Test
    public void addGetDeleteContact() {
        dao.addContact(c1);

        Contact fromDao = dao.getContactById(c1.getContactId());
        assertEquals(fromDao, c1);

        dao.removeContact(c1.getContactId());
        assertNull(dao.getContactById(c1.getContactId()));
    }

    @Test
    public void addUpdateContact() {
        dao.addContact(c1);
        c1.setPhone("2349985738");

        dao.updateContact(c1);
        Contact fromDao = dao.getContactById(c1.getContactId());
        assertEquals(c1, fromDao);
    }

    @Test
    public void getAllContacts() {
        dao.addContact(c1);
        dao.addContact(c2);
        List<Contact> cList = dao.getAllContacts();
        assertEquals(2, cList.size());
    }

    @Test
    public void searchContacts() {
        dao.addContact(c1);
        dao.addContact(c2);
        dao.addContact(c3);
        c3.setCompany("Google");

        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.LAST_NAME, "Smith");
        List<Contact> cList = dao.searchContacts(criteria);

        assertEquals(1, cList.size());
        assertEquals(c1, cList.get(0));

        criteria.put(SearchTerm.LAST_NAME, "Beth");
        cList = dao.searchContacts(criteria);

        assertEquals(1, cList.size());
        assertEquals(c2, cList.get(0));

        criteria.clear();
        criteria.put(SearchTerm.COMPANY, "google");
        cList = dao.searchContacts(criteria);
        assertEquals(2, cList.size());
        
        criteria.put(SearchTerm.LAST_NAME, "Ellison");
        cList = dao.searchContacts(criteria);
        assertEquals(1, cList.size());
        assertEquals(c3, cList.get(0));
        
        criteria.put(SearchTerm.COMPANY, "Oracle");
        cList = dao.searchContacts(criteria);
        assertEquals(0, cList.size());
    }
}
