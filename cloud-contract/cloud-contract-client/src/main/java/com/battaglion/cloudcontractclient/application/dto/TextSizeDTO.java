package com.battaglion.cloudcontractclient.application.dto;

public class TextSizeDTO {

    private final String text;
    private Integer size;

    public TextSizeDTO(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Integer getSize() {
        if (text == null) {
            return 0;
        }
        this.size = text.length();
        return size;
    }
}