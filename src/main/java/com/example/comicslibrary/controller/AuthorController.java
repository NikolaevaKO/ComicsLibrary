package com.example.comicslibrary.controller;


import com.example.comicslibrary.interfaces.IAuthor;
import com.example.comicslibrary.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AuthorController {

    private final IAuthor authors;

    @Autowired
    public AuthorController(IAuthor authors){
        this.authors = authors;
    }

    @PostMapping(value = "/author")
    public ResponseEntity<?> create(@RequestBody Author author) {
        authors.create(author);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/author")
    public ResponseEntity<List<Author>> getAll() {
        final List<Author> clients = authors.getAll();

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/author/{id}")
    public ResponseEntity<Author> getOne(@PathVariable(name = "id") int id) {
        final Author author = authors.read(id);

        return author != null
                ? new ResponseEntity<>(author, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping(value = "/author/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Author author) {
        final boolean updated = authors.update(author, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/author/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = authors.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}
