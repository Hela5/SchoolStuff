/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2;

import com.swcguild.addressbook2.dao.AddressBookDAO;
import com.swcguild.addressbook2.dto.Address;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author apprentice
 */

@Controller
public class HomeAddressControllerAjax {
    
    private AddressBookDAO dao;
    
    @Inject
    public HomeAddressControllerAjax(AddressBookDAO dao){
        this.dao = dao;
    }
    
    @RequestMapping(value={"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }
    
    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    @ResponseBody public Address getAddress(@PathVariable("id") int id){
        return dao.getAddress(id);
    }
    
    @RequestMapping(value = "/address", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody public Address createAddress(@RequestBody Address address){
        dao.addAddress(address);
        return address;
    }
    
    @RequestMapping(value = "/address/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAddress(@PathVariable("id")int id){
        dao.removeAddress(id);
    }
    
    @RequestMapping(value = "/address/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putAddress(@PathVariable("id")int id, @RequestBody Address address) {
        address.setiD(id);
        dao.updateAddress(address);
    }
    
    @RequestMapping(value = "/addresses", method = RequestMethod.GET)
    @ResponseBody
    public List<Address> getAllAddresses() {
        return dao.displayAddresses();
    }
    
}
