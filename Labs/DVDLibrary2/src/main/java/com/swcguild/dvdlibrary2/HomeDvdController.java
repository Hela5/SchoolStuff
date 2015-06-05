/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdlibrary2;


import com.swcguild.dvdlibrary2.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary2.dto.Dvd;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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
public class HomeDvdController {

    private DvdLibraryDao dao;

    @Inject
    public HomeDvdController(DvdLibraryDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/", "/displayDvdList", "/home"}, method = RequestMethod.GET)
    public String displayDvdList(Model model) {
        List<Dvd> dList = dao.listAll();
        model.addAttribute("dvdList", dList);
        return "displayDvdList";
    }

    @RequestMapping(value = "displayNewDvdForm", method = RequestMethod.GET)
    public String displayNewDvdForm() {
        return "newDvdForm";
    }

    @RequestMapping(value = "addNewDvd", method = RequestMethod.POST)
    public String addNewDvd(HttpServletRequest req) {
        String title = req.getParameter("title");
        String releaseDate = req.getParameter("releaseDate");//how LocalDate?
        String mpaaRating = req.getParameter("mpaaRating");
        String director = req.getParameter("director");
        String studio = req.getParameter("studio");
        String note = req.getParameter("note");

        Dvd dvd = new Dvd();
        dvd.setTitle(title);
        dvd.setReleaseDate(releaseDate);
        dvd.setMpaaRating(mpaaRating);
        dvd.setDirector(director);
        dvd.setStudio(studio);
        dvd.setNote(note);

        dao.add(dvd);

        return "redirect:displayDvdList";
    }

    @RequestMapping(value = "deleteDvd", method = RequestMethod.GET)
    public String deleteDvd(HttpServletRequest req) {
        int dvdId = Integer.parseInt(req.getParameter("dvdId"));
        dao.remove(dvdId);

        return "redirect:displayDvdList";
    }

    @RequestMapping(value = "displayEditDvd", method = RequestMethod.GET)
    public String displayEditDvd(HttpServletRequest req, Model model) {
        int dvdId = Integer.parseInt(req.getParameter("dvdId"));
        Dvd dvd = dao.getById(dvdId);
        model.addAttribute("dvd", dvd);
        return "editDvdForm";
    }

    @RequestMapping(value = "editDvdForm", method = RequestMethod.POST)
    public String editDvd(@Valid @ModelAttribute("dvd") Dvd dvd, BindingResult result) {
        if (result.hasErrors()) {
            return "editDvdForm";
        }
        dao.add(dvd);
        return "redirect:displayDvdList";
    }

    @RequestMapping(value = "searchResults", method = RequestMethod.POST)
    public String search(HttpServletRequest req, Model model) {
        List<Dvd> dList = new ArrayList<>();
        String searchVal = req.getParameter("searchVal");
        String searchBy = req.getParameter("searchBy");
        if (searchBy.equals("title")) {
            dList = dao.getByTitle(searchVal);
        } else if (searchBy.equals("rating")) {
            dList = dao.getByRating(searchVal);
        } else if (searchBy.equals("studio")) {
            dList = dao.getByStudio(searchVal);
        }
        model.addAttribute("dList", dList);
        return "searchResults";
    }
    
    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchForm(HttpServletRequest req, Model model) {
        return "search";
    }
    
}
