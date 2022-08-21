package com.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafaTopic {
    @Bean
    public NewTopic messageTopic(){
        return TopicBuilder.name("MESSAGE-TOPIC").build();
    }
}
