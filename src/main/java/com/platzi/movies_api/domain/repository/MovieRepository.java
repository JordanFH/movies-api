package com.platzi.movies_api.domain.repository;

import com.platzi.movies_api.domain.dto.MovieDto;
import com.platzi.movies_api.domain.dto.UpdateMovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();

    MovieDto getById(String id);

    MovieDto save(MovieDto movieDto);

    MovieDto update(String id, UpdateMovieDto updateMovieDto);
}
