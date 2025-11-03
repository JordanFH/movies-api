package com.my_app.movies_api.domain.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UpdateMovieDto(
        @NotBlank(message = "Title is required")
        String title,
        @Min(value = 1, message = "Duration must be greater than 0")
        Integer duration,
        @NotBlank(message = "Genre is required")
        String genre
) {

}
