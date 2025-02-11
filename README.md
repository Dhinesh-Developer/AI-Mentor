# Integrating Gemini AI with Spring Boot and Thymeleaf

This documentation provides step-by-step instructions to integrate Google's Gemini AI with a Spring Boot backend and Thymeleaf frontend.

## 1. Getting Started

### Prerequisites
- Java 17 or later
- Spring Boot 3+ 
- Thymeleaf for frontend templating
- Google Cloud account with Gemini API access

## 2. Getting Google API Key
1. Go to the [Google Cloud Console](https://console.cloud.google.com/)
2. Create a new project or select an existing one.
3. Navigate to **APIs & Services** > **Library**.
4. Search for **Gemini API** and enable it.
5. Go to **APIs & Services** > **Credentials**.
6. Click **Create Credentials** > **API Key**.
7. Copy the generated API key and store it securely.

## 3. Setting Up Spring Boot Project
- Create a new Spring Boot application.
- Include dependencies for Spring Web and Thymeleaf.
- Configure `application.properties` to store the API key securely.

## 4. Backend (REST API)
- Implement a REST controller to handle requests.
- Use the API key to interact with Gemini AI.
- Process and return AI-generated responses.

## 5. Frontend using Thymeleaf
- Design an HTML form to input queries.
- Send user inputs to the backend.
- Display the AI-generated responses dynamically.

## 6. Running the Application
1. Start the Spring Boot application.
2. Open a browser and navigate to the local server.
3. Enter a prompt and receive a response from Gemini AI.

## 7. Conclusion
This documentation outlines the integration of Gemini AI with Spring Boot and Thymeleaf, enabling AI-powered responses via a simple web interface.

