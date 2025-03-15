package com.dk.AI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/chat")
public class AIController {

   private final AIService aiService;

   public AIController(AIService aiService){
       this.aiService=aiService;
   }

   @GetMapping
   public String showAI(){
       return "chat";
   }

   public Map<String,String> askQuestion(@RequestParam("question") String question){
       if(question == null || question.trim().isEmpty()){
            return Map.of("error","Question cannot be empty");
   }
       try{
           String answer = aiService.getAnswer(question);
           return Map.of("response",answer);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

}
