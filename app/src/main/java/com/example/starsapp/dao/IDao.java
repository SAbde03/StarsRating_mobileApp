package com.example.starsapp.dao;
import com.example.starsapp.beans.Star;

import java.util.List;

public interface IDao<T>{
    boolean create(T o);
    boolean update(T o);
    boolean delete(T o);
    T findById(int id);
    List<T> findAll();
}



