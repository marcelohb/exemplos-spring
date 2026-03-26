package pt.mhb.spring_kafka.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic;
    private final int partitions;

    public MessageProducer(KafkaTemplate kafkaTemplate, @Value("${app.kafka-topic}") String topic, @Value("${app.kafka-partitions:0}") int partition) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
        this.partitions = partition;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, partitions, "", message);
    }
}
