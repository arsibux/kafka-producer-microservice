package com.kafka.producer.ApiResource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping(path = "/publish")
    public ResponseEntity<String> publish() {
        kafkaTemplate.send("MESSAGE-TOPIC", "Message pushed to kafka.");
        return new ResponseEntity<>("Message successfully published to kafka.", HttpStatus.CREATED);
    }
}
