package com.example.comicslibrary.interfaces;

import com.example.comicslibrary.model.Author;

import java.util.List;

public interface IAuthor {

     void create (Author a);
     List<Author> getAll();
     Author read(int id);
     boolean update (Author a, int id);
     boolean delete (int id);
}
