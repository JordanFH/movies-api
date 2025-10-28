package com.platzi.movies_api.web.controller;

import com.platzi.movies_api.persistance.entity.MovieEntity;
import com.platzi.movies_api.persistance.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAllMovies() {
        return (List<MovieEntity>) this.movieRepository.findAll();
    }
}
