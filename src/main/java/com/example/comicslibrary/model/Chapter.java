package com.example.comicslibrary.model;

public class Chapter {

    private long id;
    private long id_title;
    private String name;
    private int numder_page;
    private int number;
    private String translator;
    private  String image;

    public Chapter(long id, long id_title, String name, int numder_page, int number, String translator, String image) {
        this.id = id;
        this.id_title = id_title;
        this.name = name;
        this.numder_page = numder_page;
        this.number = number;
        this.translator = translator;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_title() {
        return id_title;
    }

    public void setId_title(long id_title) {
        this.id_title = id_title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumder_page() {
        return numder_page;
    }

    public void setNumder_page(int numder_page) {
        this.numder_page = numder_page;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString(){
        return String.format("Chapter[id = %d, title's id = %d, name = '%s', number of page = '%s', number = '%s', translator = '%s', image = '%s']",
                id, id_title,name, numder_page,number,translator,image);
    }
}
