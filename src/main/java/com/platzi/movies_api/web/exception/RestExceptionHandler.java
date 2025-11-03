package com.platzi.movies_api.web.exception;

import com.platzi.movies_api.domain.exception.MovieAlreadyExistsException;
import com.platzi.movies_api.domain.exception.MovieNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(MovieAlreadyExistsException.class)
    public ResponseEntity<Error> handleMovieAlreadyExists(MovieAlreadyExistsException exception) {
        Error error = new Error("movie-already-exists", exception.getMessage(), LocalDateTime.now());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<Error> handleMovieNotFound(MovieNotFoundException exception) {
        Error error = new Error("movie-not-found", exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleGenericException(Exception exception) {
        Error error = new Error("internal-server-error", exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
