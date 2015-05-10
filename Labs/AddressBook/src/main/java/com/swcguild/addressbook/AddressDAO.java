/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public interface AddressDAO {
    
    public void loadAddresses() throws Exception;
    
    public void writeAddresses() throws IOException;
    
    public void addAddress(Address address);
    
    public Address removeAddress(Integer iD);
    
    public Address getAddress(Integer iD);
    
    public ArrayList displayAddresses();
    
    public void editAddress(Integer iD, Address address);
    
    public ArrayList getAddress(String lastName);
    
//    public ArrayList returnAll();
    
    public int numAddress();
}
