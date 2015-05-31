/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarycomponentswap;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DvdLibraryDaoInMemImplBillHorst implements DvdLibraryDao {

    HashMap<Integer, Dvd> library = new HashMap<>();
    int Id = 0;

    @Override
    public void add(Dvd dvd) {
        dvd.setId(Id);
        library.put(dvd.getId(), dvd);
        Id++;
    }

    @Override
    public void remove(int id) {
        library.remove(id);
    }

    @Override
    public List<Dvd> listAll() {
        return library.values().stream()
                .collect(Collectors.toList());

    }

    @Override
    public Dvd getById(int id) {
        Dvd thisDvd = library.get(id);
        return thisDvd;
    }

    @Override
    public List<Dvd> getByTitle(String title) {
        return library.values().stream()
                .filter((d -> d.getTitle().equalsIgnoreCase(title)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByRating(String rating) {
        return library.values().stream()
                .filter((d -> d.getMpaaRating().equalsIgnoreCase(rating)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByStudio(String studio) {
        return library.values().stream()
                .filter((d -> d.getStudio().equalsIgnoreCase(studio)))
                .collect(Collectors.toList());
    }

}
