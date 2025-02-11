package com.dk.AI.AI_MENTOR.DKService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class QnaService {

    //load the url and key
    @Value("${gemini.api.url}")
    private String geminiApiUrl;

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    private final WebClient webClient;

    public QnaService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }

    // converting based on the gemini ai format
    public String getAnswer(String question) {
        Map<String, Object> requestBody = Map.of(
                "contents", new Object[]{
                        Map.of("parts", new Object[]{
                                Map.of("text", question)
                        })
                }
        );

        // handling the api calls
        try {

            String response = webClient.post()
                    .uri(geminiApiUrl + "?key=" + geminiApiKey)
                    .header("Content-Type", "application/json")
                    .bodyValue(requestBody)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();  // Block for synchronous execution

            return response;
        } catch (Exception e) {
            System.err.println("Error fetching response from Gemini API: " + e.getMessage());
            return "Error: Unable to fetch response from Gemini API.";
        }
    }
}