package com.swcguild.dvdlibrary2.dto;

import java.time.LocalDate;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author warde
 */
public class Dvd {

    private int id = -1;
    @NotEmpty(message = "You must supply a value for Title.")
    @Length(max = 50, message = "Title must be no longer than 50 characters in length.")
    private String title;
//    @NotEmpty(message = "You must supply a value for Release Date.")
//    @Length(max = 10, message = "Release Date must be no longer than 10 characters in length.")
    private LocalDate releaseDate;
    @NotEmpty(message = "You must supply a value for MPAA Rating.")
    @Length(max = 10, message = "MPAA Rating must be no longer than 10 characters in length.")
    private String mpaaRating;
    @NotEmpty(message = "You must supply a value for Director.")
    @Length(max = 50, message = "Director must be no longer than 50 characters in length.")
    private String director;
    @NotEmpty(message = "You must supply a value for Studio.")
    @Length(max = 50, message = "Studio must be no longer than 50 characters in length.")
    private String studio;
    @NotEmpty(message = "You must supply a value for Note.")
    @Length(max = 50, message = "Note must be no longer than 50 characters in length.")
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
