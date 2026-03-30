package pt.mhb.cloud_stream.controller;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")
public class TextSenderController {

    private final StreamBridge streamBridge;

    public TextSenderController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @PostMapping("/send")
    public ResponseEntity sendText(@RequestParam String text) {
        System.out.println("Sending text: " + text);
        streamBridge.send("textProducer-out-0", text);
        return ResponseEntity.ok().build();
    }
}
