package com.example.comicslibrary.dao;

import java.util.List;
import java.util.Optional;

public interface DAO <T> {

    List<T> getAll();
    void add(T t);
    void update(T t);
    void delete(int id);
    Optional<T> getOne(int id);
}
