/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarywithstreams;

import com.swcguild.dvdlibrarywithstreams.controller.DVDLibraryController;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        DVDLibraryController dvdLibCont = new DVDLibraryController();
        dvdLibCont.run();
    }
    
}
