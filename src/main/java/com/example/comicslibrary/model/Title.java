package com.example.comicslibrary.model;

public class Title {
    private long id;
    private long id_author;
    private String name;
    private long year;
    private String genre;
    private String rformat;
    private String publisher;
    private String status;
    private String rating;
    private String description;
    private String image;

    public Title (long id,long id_author, String name, long year, String genre, String rformat, String publisher, String status, String rating,String  description, String image){
        this.id = id;
        this.id_author = id_author;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rformat = rformat;
        this.publisher = publisher;
        this.status = status;
        this.rating = rating;
        this.description = description;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_author() {
        return id_author;
    }

    public void setId_author(long id_author) {
        this.id_author = id_author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRformat() {
        return rformat;
    }

    public void setRformat(String rformat) {
        this.rformat = rformat;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString(){
        return  String.format("Title[id=%d, author's id =%d, name = '&s', year = '&s', genre = '&s', release format = '&s', publisher = '&s', rating = '&s', description = '&s', image = '&s']",
                id, id_author, name, year, genre, rformat, publisher, rating, description, image);
    }
}
