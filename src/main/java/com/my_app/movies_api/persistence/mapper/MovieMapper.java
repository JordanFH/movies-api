package com.my_app.movies_api.persistence.mapper;

import com.my_app.movies_api.domain.dto.MovieDto;
import com.my_app.movies_api.persistence.entity.MovieEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(source = "id", target = "id")
    MovieDto toMovieDto(MovieEntity movieEntity);

    List<MovieDto> toMovieDto(Iterable<MovieEntity> movieEntities);

    @InheritInverseConfiguration
    MovieEntity toMovieEntity(MovieDto movieDto);

    Iterable<MovieEntity> toMovieEntity(List<MovieDto> movieDtos);
}
