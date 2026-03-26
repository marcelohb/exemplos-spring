package pt.mhb.spring_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "text-message-topic", groupId = "text-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}
