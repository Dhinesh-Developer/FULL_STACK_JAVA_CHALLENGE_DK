package com.dk.AI;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class AIService {

    private final WebClient webClient;
    private final String geminiApiUrl;
    private final String geminiApiKey;

    public AIService(WebClient.Builder webClientBuilber, @Value("${gemini.api.url}") String geminiApiUrl,@Value("${gemini.api.key}") String geminiApiKey) {
        this.webClient = WebClient.builder().build();
        this.geminiApiUrl = geminiApiUrl;
        this.geminiApiKey = geminiApiKey;
    }


    public String getAnswer(String question) {

        Map<String,Object> requestBody = Map.of(
                "contents",new Object[]{
                        Map.of("parts",new Object[]{
                                Map.of("text",question)
                        })
                }
        );

        try{
            String jsonResponse = webClient.post().uri(geminiApiUrl+"?key="+geminiApiKey)
                    .header("Content-Type","application/json")
                    .bodyValue(requestBody)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonResponse);

            JsonNode candidatesNode = rootNode.path("candidates");
            if (candidatesNode.isArray() && candidatesNode.size() > 0) {
                JsonNode contentParts = candidatesNode.get(0).path("content").path("parts");
                if (contentParts.isArray() && contentParts.size() > 0) {
                    JsonNode textNode = contentParts.get(0).path("text");
                    return textNode.asText();
                }
            }
            return "No valid response found.";


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
