package com.example.producer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListner {


    @KafkaListener(topics = "rider-topic", groupId = "rider-group")
    public void listen(RiderLocation rideLocation) {
        System.out.println("Received message: " + rideLocation.getDepartment());

    }

}
