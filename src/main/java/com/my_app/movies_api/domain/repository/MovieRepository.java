package com.my_app.movies_api.domain.repository;

import com.my_app.movies_api.domain.dto.MovieDto;
import com.my_app.movies_api.domain.dto.UpdateMovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();

    MovieDto getById(String id);

    MovieDto save(MovieDto movieDto);

    MovieDto update(String id, UpdateMovieDto updateMovieDto);

    MovieDto delete(String id);
}
