package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("music")
public class Music {

    @Id
    private String Id;
    private String Titlle;
    private String Artist;
    private String Album; 
    private String Genre;
    private Integer YearOfLanch;
    private String Composer;  




    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getTitlle() {
        return Titlle;
    }
    public void setTitlle(String titlle) {
        Titlle = titlle;
    }
    public String getArtist() {
        return Artist;
    }
    public void setArtist(String artist) {
        Artist = artist;
    }
    public String getAlbum() {
        return Album;
    }
    public void setAlbum(String album) {
        Album = album;
    }
    public String getGenre() {
        return Genre;
    }
    public void setGenre(String genre) {
        Genre = genre;
    }
    public Integer getYearOfLanch() {
        return YearOfLanch;
    }
    public void setYearOfLanch(Integer yearOfLanch) {
        YearOfLanch = yearOfLanch;
    }
    public String getComposer() {
        return Composer;
    }
    public void setComposer(String composer) {
        Composer = composer;
    }

    





    
}
