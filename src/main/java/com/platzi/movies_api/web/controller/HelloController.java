package com.platzi.movies_api.web.controller;

import com.platzi.movies_api.domain.service.MoviesApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String platform;
    private final MoviesApiService moviesApiService;

    public HelloController(@Value("${spring.application.name}") String platform, MoviesApiService moviesApiService) {
        this.platform = platform;
        this.moviesApiService = moviesApiService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.moviesApiService.generateGreeting(platform);
    }
}
