package com.platzi.movies_api.domain.service;

import com.platzi.movies_api.domain.dto.MovieDto;
import com.platzi.movies_api.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAll() {
        return this.movieRepository.getAll();
    }
}
