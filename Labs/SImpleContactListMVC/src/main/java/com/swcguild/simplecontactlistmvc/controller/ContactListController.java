/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.simplecontactlistmvc.controller;

import com.swcguild.simplecontactlistmvc.dto.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */

@Controller
public class ContactListController {
    
    @RequestMapping( value = "displayContactList", method = RequestMethod.GET)
    public String displayContactList(HttpServletRequest req, Model model) {
        
        Contact c1 = new Contact();
        c1.setFirstName("Joe");
        c1.setLastName("Smith");
        c1.setEmail("js@gmail.com");
        
        Contact c2 = new Contact();
        c2.setFirstName("Betty");
        c2.setLastName("Jane");
        c2.setEmail("Betty@yahoo.com");
        
        Contact c3 = new Contact();
        c3.setFirstName("Mike");
        c3.setLastName("Bo");
        c3.setEmail("MJ@gmail.com");
        
        List<Contact> cList = new ArrayList<>();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        
        model.addAttribute("listOfContacts", cList);
        
        return "displayContactList";
    }
    
}
