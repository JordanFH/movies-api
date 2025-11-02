package com.platzi.movies_api.persistance;

import com.platzi.movies_api.domain.dto.MovieDto;
import com.platzi.movies_api.domain.repository.MovieRepository;
import com.platzi.movies_api.persistance.crud.CrudMovieEntity;
import com.platzi.movies_api.persistance.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toMovieDto(this.crudMovieEntity.findAll());
    }
}
