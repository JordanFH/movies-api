package com.platzi.movies_api.persistance.mapper;

import com.platzi.movies_api.domain.dto.MovieDto;
import com.platzi.movies_api.persistance.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(source = "id", target = "id")
    MovieDto toMovieDto(MovieEntity movieEntity);

    List<MovieDto> toMovieDto(Iterable<MovieEntity> movieEntities);

    @Mapping(source = "id", target = "id")
    MovieEntity toMovieEntity(MovieDto movieDto);

    Iterable<MovieEntity> toMovieEntity(List<MovieDto> movieDtos);
}
