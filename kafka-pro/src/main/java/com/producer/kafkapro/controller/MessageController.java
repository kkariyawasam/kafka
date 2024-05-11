package com.producer.kafkapro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.producer.kafkapro.service.KafkaProService;

@RestController
public class MessageController {

    private final KafkaProService kafkaProducer;

    public MessageController(KafkaProService kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/send")
    public void sendMessageToKafka(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
    }
}