package com.example.comicslibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table( name = "authors")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Author {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "authorsIdSeq", sequenceName = "authors_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorsIdSeq")
    private int id;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "description")
    private String description;

   // private String image;

    public Author() { }

    public Author(int id, String nickname){
        this.id = id;
        this.nickname = nickname;
    }

    public Author (int id, String nickname, String name, String country, String description){
        this.id = id;
        this.nickname = nickname;
        this.name = name;
        this.country = country;
        this.description = description;
     //   this.image = image;
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

   /* public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    */

    @Override
    public String toString (){
        return String.format("Author[id = '%s', nickname = '%s', name = '%s', country = '%s', description = '%s']",
                id, nickname, name, country, description);
    }
}
