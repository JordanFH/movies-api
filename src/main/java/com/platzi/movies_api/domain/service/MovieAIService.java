package com.platzi.movies_api.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface MovieAIService {
    @UserMessage("""
            Genera un saludo de bienvenida para la aplicación {{platform}}. Usa menos de 120 carácteres.
            """)
    String generateGreeting(@V("platform") String platform);
}
