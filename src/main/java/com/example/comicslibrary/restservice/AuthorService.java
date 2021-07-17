package com.example.comicslibrary.restservice;


import com.example.comicslibrary.interfaces.IAuthor;
import com.example.comicslibrary.model.Author;
import com.example.comicslibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthor {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void create(Author a){
        authorRepository.save(a);
    }

    @Override
    public List<Author> getAll(){
        return authorRepository.findAll();
    }

    @Override
    public Author read (int id){
        return authorRepository.getOne(id);
    }

    @Override
    public boolean update(Author a, int id) {
        if (authorRepository.existsById(id)) {
            a.setId(id);
            authorRepository.save(a);
            return true;
        }

        return false;
    }


    public boolean delete(int id) {
        if (authorRepository.existsById(id)) {
            authorRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
