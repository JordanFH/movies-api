package com.my_app.movies_api.web.controller;

import com.my_app.movies_api.domain.service.MovieAIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String platform;
    private final MovieAIService moviesApiService;

    public HelloController(@Value("${spring.application.name}") String platform, MovieAIService moviesApiService) {
        this.platform = platform;
        this.moviesApiService = moviesApiService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.moviesApiService.generateGreeting(platform);
    }
}
