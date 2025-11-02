package com.platzi.movies_api.domain.repository;

import com.platzi.movies_api.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
