package com.platzi.movies_api.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record MovieDto(
        String id,
        String title,
        Integer duration,
        String genre,
        LocalDate releaseDate,
        BigDecimal rating
) {

}
