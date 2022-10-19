package com.example.moviebackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="movies")
public class MovieModel {
    @Id
    @GeneratedValue
    private int id;
    private String movieName;
    private String releasedYear;
    private String language;

    public MovieModel(int id, String movieName, String releasedYear, String language) {
        this.id = id;
        this.movieName = movieName;
        this.releasedYear = releasedYear;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public MovieModel() {
    }
}
