package com.example.producer;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

    @Bean
    public NewTopic createTopic() {
        return new NewTopic("rider-topic", 1, (short) 1);
    }

}
