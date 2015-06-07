/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2;

import com.swcguild.addressbook2.dao.AddressBookDAO;
import com.swcguild.addressbook2.dto.Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
public class HomeAddressController {

    private AddressBookDAO dao;

    @Inject
    public HomeAddressController(AddressBookDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(value =  "/displayAddList", method = RequestMethod.GET)
    public String displayAddList(Model model) {
        List<Address> aList = dao.displayAddresses();
        model.addAttribute("aList", aList);
        return "displayAddList";
    }

    @RequestMapping(value = "displayNewAddForm", method = RequestMethod.GET)
    public String displayNewAddForm() {
        return "newAddForm";
    }

    @RequestMapping(value = "addNewAddress", method = RequestMethod.POST)
    public String addNewAddress(HttpServletRequest req) {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String streetAddress = req.getParameter("streetAddress");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zipCode = req.getParameter("zipCode");

        Address address = new Address();
        address.setFirstName(firstName);
        address.setLastName(lastName);
        address.setStreetAddress(streetAddress);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(Integer.parseInt(zipCode));

        dao.addAddress(address);

        return "redirect:displayAddList";
    }

    @RequestMapping(value = "deleteAddress", method = RequestMethod.GET)
    public String deleteAddress(HttpServletRequest req) {
        int addressId = Integer.parseInt(req.getParameter("addId"));
        dao.removeAddress(addressId);

        return "redirect:displayAddList";
    }

    @RequestMapping(value = "displayEditAddForm", method = RequestMethod.GET)
    public String displayEditAddForm(HttpServletRequest req, Model model) {
        int addressId = Integer.parseInt(req.getParameter("addId"));
        Address address = dao.getAddress(addressId);
        model.addAttribute("address", address);

        return "editAddForm";
    }

    @RequestMapping(value = "editAddForm", method = RequestMethod.POST)
    public String editAddress(@Valid @ModelAttribute("address") Address address, BindingResult result) {
        if (result.hasErrors()) {
            return "editAddForm";
        }
        dao.editAddress(address.getiD(), address);

        return "redirect:displayAddList";
    }

    @RequestMapping(value = "searchAddForm", method = RequestMethod.GET)
    public String searchAddForm(HttpServletRequest req, Model model) {
        return "searchAddForm";
    }

    @RequestMapping(value = "searchResults", method = RequestMethod.POST)
    public String searchResults(HttpServletRequest req, Model model) {
        List<Address> aList = new ArrayList<>();
        Map<String, List<Address>> addMap = new HashMap<>();
        String searchVal = req.getParameter("searchVal");
        String searchBy = req.getParameter("searchBy");

        if (searchBy.equals("city")) {
            aList = dao.searchByCity(searchVal);
        } else if (searchBy.equals("state")) {
            aList = dao.searchByState(searchVal);
        } else if (searchBy.equals("zipCode")) {
            aList = dao.searchByZipCode(Integer.parseInt(searchVal));
        }
        model.addAttribute("aList", aList);
        return "searchResults";
    }

}
