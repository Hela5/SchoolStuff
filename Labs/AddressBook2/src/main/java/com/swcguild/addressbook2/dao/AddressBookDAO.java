/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook2.dao;

import com.swcguild.addressbook2.dto.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface AddressBookDAO {
    public void loadAddresses() throws Exception;
    
    public void writeAddresses() throws IOException;
    
    public void addAddress(Address address);
    
    public Address removeAddress(Integer iD);
    
    public Address getAddress(Integer iD);
    
    public List<Address> displayAddresses();
    
    public void editAddress(Integer iD, Address address);
    
    public List<Address> getAddress(String lastName);
    
    public int numAddress();
    
    public List<Address> searchByCity(String city);
    
    public List<Address> searchByState(String state);
    
    public List<Address> searchByZipCode(int zipCode);
    
    public void updateAddress(Address address);
}
