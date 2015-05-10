/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary;

import java.io.IOException;

/**
 *
 * @author apprentice
 */
public interface DVDLibraryDAO {

    public void loadLibrary() throws Exception;

    public void writeLibrary() throws IOException;

    public DVD getDVD(String title);

    public DVD addDVD(String title, DVD dvd);

    public DVD removeDVD(String title);

    public String[] returnAllDVDs();
    
    public void editDVD(String title, DVD newDVD);
}
