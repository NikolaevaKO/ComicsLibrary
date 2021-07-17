package com.example.comicslibrary.model;

public class Type {
    private long id;
    private String name;
    private String country;
    private String description;
    private String image;

    public Type(long id, String name, String country, String description, String image){
        this.id = id;
        this.name = name;
        this.country = country;
        this.description = description;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        return String.format("Type[id = %d, name = '%s', country = '%s', description = '%s', image = '%s']",
                id, name, country, description, image);
    }


}
