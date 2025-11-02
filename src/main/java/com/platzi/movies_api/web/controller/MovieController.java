package com.platzi.movies_api.web.controller;

import com.platzi.movies_api.domain.dto.MovieDto;
import com.platzi.movies_api.domain.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieDto> getAll() {
        return this.movieService.getAll();
    }
}
