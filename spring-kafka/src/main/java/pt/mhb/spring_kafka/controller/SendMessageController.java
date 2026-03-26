package pt.mhb.spring_kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pt.mhb.spring_kafka.service.MessageProducer;

@Controller
@RequestMapping("/messages")
public class SendMessageController {

    private final MessageProducer messageProducer;

    public SendMessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @PostMapping(value = "/send", consumes = "text/plain")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        messageProducer.sendMessage(message);
        return ResponseEntity.ok("Message \"" + message + "\" sent successfully");
    }
}
