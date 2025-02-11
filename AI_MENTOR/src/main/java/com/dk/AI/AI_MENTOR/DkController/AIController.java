package com.dk.AI.AI_MENTOR.DkController;

import com.dk.AI.AI_MENTOR.DKService.QnaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/chat")
public class AIController {

    private final QnaService qnaService;

    public AIController(QnaService qnaService) {
        this.qnaService = qnaService;
    }


    @GetMapping
    public String chatPage() {
        return "chat";
    }

    // controller for the the request and response
    @PostMapping("/ask")
    @ResponseBody
    public Map<String, String> askQuestion(@RequestParam("question") String question) {
        if (question == null || question.trim().isEmpty()) {
            return Map.of("error", "Question cannot be empty.");
        }

        try {
            String answer = qnaService.getAnswer(question);
            return Map.of("response", answer);
        } catch (Exception e) {
            return Map.of("error", "Error fetching response from AI.");
        }
    }
}
