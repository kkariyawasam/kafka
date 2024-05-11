package com.producer.kafkapro.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC_NAME= "any-topic-name"; // Replace with your desired topic name

    public KafkaProService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC_NAME, message);
        System.out.println("Message " + message +
             " has been sucessfully sent to the topic: " + TOPIC_NAME);
    }
}
