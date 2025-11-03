package com.platzi.movies_api.domain.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String message) {
        super("Movie id doesn't exist: " + message);
    }
}
