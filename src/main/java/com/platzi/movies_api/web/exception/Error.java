package com.platzi.movies_api.web.exception;

import java.time.LocalDateTime;

public record Error(String type, String message, LocalDateTime timestamp) {
}
