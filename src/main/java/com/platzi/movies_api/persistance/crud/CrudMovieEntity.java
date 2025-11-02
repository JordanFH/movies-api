package com.platzi.movies_api.persistance.crud;

import com.platzi.movies_api.persistance.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, String> {
}
