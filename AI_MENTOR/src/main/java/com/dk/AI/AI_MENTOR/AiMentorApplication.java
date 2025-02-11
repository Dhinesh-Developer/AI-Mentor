package com.dk.AI.AI_MENTOR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiMentorApplication {

	public static void main(String[] args) {

		SpringApplication.run(AiMentorApplication.class, args);
	}

}
/*
*   // Make API call ->

            // 1. uri -> Constructs the API endpoint with the API key as a query parameter.
            // 2. header -> Sets the content type as JSON.
            // 3. bodyValue -> Attaches the constructed payload to the request.
            // 4. retrieve -> Executes the request and gets the response.
            // 5. bodyToMono -> Converts response to a String.
            // 6. block() -> Blocks execution to get the response synchronously.*/