package com.example.moviebackend.dao;

import com.example.moviebackend.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {

}
