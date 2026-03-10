package com.battaglion.cloudcontractclient.controller;

import com.battaglion.cloudcontractclient.application.dto.TextSizeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SendMessageController {

    private final RestTemplate restTemplate;

    public SendMessageController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/message/send/")
    public ResponseEntity sendMessage(@PathVariable String text) {
        TextSizeDTO textSize = restTemplate.getForObject("http://localhost:8080/text-size/?text=hello", TextSizeDTO.class);
        return ResponseEntity.ok(text + " sent. Size:" + textSize.getSize());
    }
}
