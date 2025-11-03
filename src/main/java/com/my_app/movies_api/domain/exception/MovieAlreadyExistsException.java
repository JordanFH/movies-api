package com.my_app.movies_api.domain.exception;

public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String movieTitle) {
        super("Movie already exists: " + movieTitle);
    }
}
