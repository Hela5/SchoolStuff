/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrarycomponentswap;

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class DvdLibraryDaoInMemImpl implements DvdLibraryDao {

    public Map<Integer, Dvd> dvds = new HashMap<>();
    private static int iD = 0;

    @Override
    public void add(Dvd dvd) {
        dvd.setId(iD++);
        dvds.put(dvd.getId(), dvd);
    }

    @Override
    public void remove(int id) {
        dvds.remove(id);
    }

    @Override
    public List<Dvd> listAll() {
        return dvds.values()
                .stream()
                .collect(Collectors.toList());

    }

    @Override
    public List<Dvd> getByTitle(String title) {
        return dvds.values()
                .stream()
                .filter(s -> s.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByRating(String rating) {
        return dvds.values()
                .stream()
                .filter(s -> s.getMpaaRating().equals(rating))
                .collect(Collectors.toList());
    }

    @Override
    public List<Dvd> getByStudio(String studio) {
        return dvds.values()
                .stream()
                .filter(s -> s.getStudio().equals(studio))
                .collect(Collectors.toList());
    }

    @Override
    public Dvd getById(int id) {
        Dvd thisDvd = dvds.get(id);
        return thisDvd;
    }

}
