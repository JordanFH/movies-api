package com.my_app.movies_api.persistence.crud;

import com.my_app.movies_api.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, String> {
    MovieEntity findFirstByTitle(String title);
}
