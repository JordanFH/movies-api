package com.my_app.movies_api.domain.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.math.BigDecimal;
import java.time.LocalDate;

public record MovieDto(
        String id,
        @NotBlank(message = "Title is required")
        String title,
        @Min(value = 1, message = "Duration must be greater than 0")
        Integer duration,
        @NotBlank(message = "Genre is required")
        String genre,
        @PastOrPresent(message = "Release date must be in the past or present")
        LocalDate releaseDate,
        @Min(value = 0, message = "Rating must be greater than or equal to 0")
        @Max(value = 5, message = "Rating must be less than or equal to 5")
        BigDecimal rating
) {

}
