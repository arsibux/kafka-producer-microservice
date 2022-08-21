package com.kafka.producer.ApiResource;

import com.kafka.producer.request.MessageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/publish")
public class MessageController {

    private final KafkaTemplate<String, MessageRequest> kafkaTemplate;

    public MessageController(KafkaTemplate<String, MessageRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<String> publish(@RequestBody MessageRequest message){
        kafkaTemplate.send("MESSAGE-TOPIC",message);
        return new ResponseEntity<>("Message successfully published to kafka.", HttpStatus.CREATED);
    }
}
