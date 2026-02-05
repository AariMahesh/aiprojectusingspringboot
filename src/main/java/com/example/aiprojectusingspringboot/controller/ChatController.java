package com.example.aiprojectusingspringboot.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
//    private ChatClient chatClient;
//    public ChatController (ChatClient.Builder chatClientBuilder)
//    {
//        this.chatClient=chatClientBuilder.build();
//    }
//    @GetMapping("/jokes")
//    public String generate(@RequestParam(value = "message",defaultValue = "tell me a dad joke about computer") String message)
//    {
//        return chatClient.prompt(message).call().content();
//
//    }
    @Autowired
    private OpenAiChatModel openAiChatModel;
    @GetMapping("/jokes")
    public String generate(@RequestParam(value = "message",defaultValue = "tell me a dad joke about computer") String message)
    {
        return openAiChatModel.call(message);

    }

}
