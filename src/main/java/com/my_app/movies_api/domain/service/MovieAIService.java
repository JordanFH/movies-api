package com.my_app.movies_api.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface MovieAIService {
    @UserMessage("""
            Generate a greeting for the application {{platform}}. Must be less than 120 characters.
            """)
    String generateGreeting(@V("platform") String platform);
}
