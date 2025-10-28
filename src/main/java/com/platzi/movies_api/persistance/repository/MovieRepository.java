package com.platzi.movies_api.persistance.repository;

import com.platzi.movies_api.persistance.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieEntity, String> {
}
