package com.my_app.movies_api.domain.dto;

public record UpdateMovieDto(
        String title,
        Integer duration,
        String genre
) {

}
