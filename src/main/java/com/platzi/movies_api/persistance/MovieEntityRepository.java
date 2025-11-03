package com.platzi.movies_api.persistance;

import com.platzi.movies_api.domain.dto.MovieDto;
import com.platzi.movies_api.domain.dto.UpdateMovieDto;
import com.platzi.movies_api.domain.exception.MovieAlreadyExistsException;
import com.platzi.movies_api.domain.exception.MovieNotFoundException;
import com.platzi.movies_api.domain.repository.MovieRepository;
import com.platzi.movies_api.persistance.crud.CrudMovieEntity;
import com.platzi.movies_api.persistance.entity.MovieEntity;
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

    @Override
    public MovieDto getById(String id) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElseThrow(() -> new MovieNotFoundException(id));
        return this.movieMapper.toMovieDto(movieEntity);
    }

    @Override
    public MovieDto save(MovieDto movieDto) {
        if (this.crudMovieEntity.findFirstByTitle(movieDto.title()) != null) {
            throw new MovieAlreadyExistsException(movieDto.title());
        }

        MovieEntity movieEntity = this.movieMapper.toMovieEntity(movieDto);
        return this.movieMapper.toMovieDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public MovieDto update(String id, UpdateMovieDto updateMovieDto) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElseThrow(() -> new MovieNotFoundException(id));

        movieEntity.setTitle(updateMovieDto.title());
        movieEntity.setDuration(updateMovieDto.duration());
        movieEntity.setGenre(updateMovieDto.genre());

        return this.movieMapper.toMovieDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public MovieDto delete(String id) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElseThrow(() -> new MovieNotFoundException(id));

        this.crudMovieEntity.delete(movieEntity);
        return this.movieMapper.toMovieDto(movieEntity);
    }
}
