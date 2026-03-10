package com.battaglion.cloudcontract.controller;

import com.battaglion.cloudcontract.application.dto.TextSizeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextSizeController {

    @GetMapping("/text-size/")
    public TextSizeDTO createText(@RequestParam String text) {
        TextSizeDTO textSize = new TextSizeDTO(text);
        return textSize;
    }
}
